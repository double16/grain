/*
 * Copyright (c) 2013 SysGears, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sysgears.grain.highlight

/**
 * Highlight fragment information
 */
class HighlightInfo {
    
    /** The language of the code, null if unknown */
    String lang
    
    /** The caption to be used for the code */
    String caption
    
    /** The code to highlight */
    String code
    
    /** Whether line numbers should be included */
    Boolean linenos
}
