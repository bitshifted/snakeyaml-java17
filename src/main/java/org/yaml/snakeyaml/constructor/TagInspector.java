/**
 * Copyright (c) 2008, SnakeYAML
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.yaml.snakeyaml.constructor;

import org.yaml.snakeyaml.nodes.Tag;

/**
 * Check if the global tags are allowed (the local tags are always allowed) It should control the
 * classes to create to prevent possible remote code invocation when the data comes from untrusted
 * source.
 */
public interface TagInspector {

  /**
   * Check
   *
   * @param tag - the global tag to allow
   * @return true when the custom global tag is allowed to create a custom Java instance
   */
  boolean allowGlobalTag(Tag tag);

}