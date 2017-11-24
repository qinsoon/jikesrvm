/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package org.mmtk.harness.options;

import org.mmtk.harness.Harness;
import org.vmutil.options.StringOption;

/**
 * A set of objects to watch
 */
public class WatchVar extends StringOption {

  /**
   */
  public WatchVar() {
    super(Harness.options, "Watch Var", "A variable (method.var) to watch",
        null);
  }
}
