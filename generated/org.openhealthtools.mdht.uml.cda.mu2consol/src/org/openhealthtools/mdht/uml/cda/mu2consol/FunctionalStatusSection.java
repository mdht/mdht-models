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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Functional Status Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getFunctionalStatusSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolFunctionalStatusSectionTemplateId' templateId.root='2.16.840.1.113883.10.20.22.2.14'"
 * @generated
 */
public interface FunctionalStatusSection extends
		org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(consol::CognitiveStatusResultObservation
	 * )).oclAsType(consol::CognitiveStatusResultObservation) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)'"
	 * @generated
	 */
	EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not
	 * organizer.oclIsUndefined() and
	 * organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer
	 * )).oclAsType(consol::CognitiveStatusResultOrganizer) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)'"
	 * @generated
	 */
	EList<CognitiveStatusResultOrganizer> getMu2consolCognitiveStatusResultOrganizers();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::FunctionalStatusResultObservation)).oclAsType(mu2consol::FunctionalStatusResultObservation)'"
   * @generated
   */
	EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(mu2consol::FunctionalStatusResultOrganizer)).oclAsType(mu2consol::FunctionalStatusResultOrganizer)'"
   * @generated
   */
	EList<FunctionalStatusResultOrganizer> getMu2consolFunctionalStatusResultOrganizers();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public FunctionalStatusSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public FunctionalStatusSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSection
