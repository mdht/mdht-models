/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Cause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getFamilyHistoryCauseOfDeathObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistoryCauseOfDeathObservationTemplateId FamilyHistoryCauseOfDeathObservationCauseOfDeathObservation' templateId.root='2.16.840.1.113883.10.20.1.42'"
 * @generated
 */
public interface FamilyHistoryCauseOfDeathObservation extends FamilyHistoryObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)'"
	* @generated
	*/
	boolean validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @model kind="operation" required="true" ordered="false"
	*        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::CauseOfDeathObservation)).oclAsType(ccd::CauseOfDeathObservation)'"
	* @generated
	*/
	EList<CauseOfDeathObservation> getCauseOfDeathObservations();

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public FamilyHistoryCauseOfDeathObservation init();

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated
	   */
	public FamilyHistoryCauseOfDeathObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FamilyHistoryCauseOfDeathObservation
