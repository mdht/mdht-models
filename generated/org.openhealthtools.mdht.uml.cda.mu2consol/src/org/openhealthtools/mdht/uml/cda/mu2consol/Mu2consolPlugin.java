/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the mu2consol_Ecore model plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public final class Mu2consolPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public static final Mu2consolPlugin INSTANCE = new Mu2consolPlugin();

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static Implementation plugin;

	/**
   * Create the instance.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public Mu2consolPlugin() {
    super(new ResourceLocator [] {});
  }

	/**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
	@Override
	public ResourceLocator getPluginResourceLocator() {
    return plugin;
  }

	/**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
	public static Implementation getPlugin() {
    return plugin;
  }

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
     * Creates an instance.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
		public Implementation() {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
	}

}
