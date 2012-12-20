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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Encounter Activities</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getEncounterActivities()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolEncounterActivitiesTemplateId' templateId.root='2.16.840.1.113883.10.20.22.4.49' constraints.validation.warning='Mu2consolEncounterActivitiesCodeValue'"
 * @generated
 */
public interface EncounterActivities extends
		org.openhealthtools.mdht.uml.cda.consol.EncounterActivities {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.3' xor self.code.codeSystem =
	 * '2.16.840.1.113883.6.96'
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code.codeSystem = \'2.16.840.1.113883.6.3\' xor self.code.codeSystem = \'2.16.840.1.113883.6.96\''"
	 * @generated
	 */
	boolean validateMu2consolEncounterActivitiesCodeValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public EncounterActivities init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EncounterActivities init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncounterActivities
