/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal;

import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage#getMeningococcalResultOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.3.140' constraints.validation.error='MeningococcalResultOrganizerTemplateId'"
 * @generated
 */
public interface MeningococcalResultOrganizer extends ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(meningococcal::MeningococcalResultObservation))->asSequence()->first().oclAsType(meningococcal::MeningococcalResultObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(meningococcal::MeningococcalResultObservation))->asSequence()->first().oclAsType(meningococcal::MeningococcalResultObservation)'"
	 * @generated
	 */
	MeningococcalResultObservation getMeningococcalResultObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalResultOrganizer init();
} // MeningococcalResultOrganizer
