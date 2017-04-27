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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Hospital Discharge Medications Section</b></em>'. <!-- end-user-doc
 * -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getHospitalDischargeMedicationsSection()
 * @model annotation= "http://www.openhealthtools.org/mdht/uml/cda/annotation
 *        constraints.validation.error='mu2consolHospitalDischargeMedicationsSectionDischargeMedication
 *        mu2consolHospitalDischargeMedicationsSectionMedicationActivity'"
 * @generated
 */
public interface HospitalDischargeMedicationsSection
		extends org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined()
	 * and entry.act.oclIsKindOf(consol::DischargeMedication))
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation= "http://www.eclipse.org/uml2/1.1.0/GenModel
	 *        body='self.entry->exists(entry : cda::Entry | not
	 *        entry.act.oclIsUndefined() and
	 *        entry.act.oclIsKindOf(consol::DischargeMedication))'"
	 * @generated
	 */
	boolean validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not
	 * entry.substanceAdministration.oclIsUndefined() and
	 * entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation= "http://www.eclipse.org/uml2/1.1.0/GenModel
	 *        body='self.entry->one(entry : cda::Entry | not
	 *        entry.substanceAdministration.oclIsUndefined() and
	 *        entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))'"
	 * @generated
	 */
	boolean validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::DischargeMedication)).oclAsType(consol::DischargeMedication)
	 * <!-- end-model-doc -->
	 *
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel
	 *        body='self.getActs()->select(act : cda::Act | not
	 *        act.oclIsUndefined() and
	 *        act.oclIsKindOf(consol::DischargeMedication)).oclAsType(consol::DischargeMedication)'"
	 * @generated
	 */
	EList<DischargeMedication> getmu2consolDischargeMedications();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration :
	 * cda::SubstanceAdministration | not
	 * substanceAdministration.oclIsUndefined() and
	 * substanceAdministration.oclIsKindOf
	 * (consol::MedicationActivity))->asSequence
	 * ()->any(true).oclAsType(consol::MedicationActivity) <!-- end-model-doc
	 * -->
	 *
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel
	 *        body='self.getSubstanceAdministrations()->select(substanceAdministration
	 *        : cda::SubstanceAdministration | not
	 *        substanceAdministration.oclIsUndefined() and
	 *        substanceAdministration.oclIsKindOf(consol::MedicationActivity))->asSequence()->any(true).oclAsType(consol::MedicationActivity)'"
	 * @generated
	 */
	MedicationActivity getMedicationActivity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSection init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HospitalDischargeMedicationsSection
