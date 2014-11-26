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
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Ambulatory Summary</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#validateVDTAmbulatorySummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Summary Provider Name And Contact Info</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#validateVDTAmbulatorySummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Summary Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VDTAmbulatorySummaryOperations extends
		ViewDownloadTransmitSummaryOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VDTAmbulatorySummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTAmbulatorySummaryProviderNameAndContactInfo(VDTAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Ambulatory Summary Provider Name And Contact Info</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTAmbulatorySummaryProviderNameAndContactInfo(VDTAmbulatorySummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->notEmpty() and self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty())) or (self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->notEmpty() and self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->exists(assignedEntity->excluding(null).assignedPerson->excluding(null).name->notEmpty() and assignedEntity->excluding(null).addr->notEmpty() and assignedEntity->excluding(null).telecom->notEmpty()))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTAmbulatorySummaryProviderNameAndContactInfo(VDTAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Ambulatory Summary Provider Name And Contact Info</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTAmbulatorySummaryProviderNameAndContactInfo(VDTAmbulatorySummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param vdtAmbulatorySummary
	 *            The receiving '<em><b>VDT Ambulatory Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTAmbulatorySummaryProviderNameAndContactInfo(
			VDTAmbulatorySummary vdtAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_AMBULATORY_SUMMARY);
			try {
				VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtAmbulatorySummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_AMBULATORY_SUMMARY__VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO,
								Mu2consolPlugin.INSTANCE
										.getString("VDTAmbulatorySummaryProviderNameAndContactInfo"),
								new Object[] { vdtAmbulatorySummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateVDTAmbulatorySummaryMedicationsSection(VDTAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Ambulatory Summary Medications Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTAmbulatorySummaryMedicationsSection(VDTAmbulatorySummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateVDTAmbulatorySummaryMedicationsSection(VDTAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate VDT Ambulatory Summary Medications Section</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateVDTAmbulatorySummaryMedicationsSection(VDTAmbulatorySummary,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param vdtAmbulatorySummary
	 *            The receiving '<em><b>VDT Ambulatory Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTAmbulatorySummaryMedicationsSection(
			VDTAmbulatorySummary vdtAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_AMBULATORY_SUMMARY);
			try {
				VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(vdtAmbulatorySummary)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.VDT_AMBULATORY_SUMMARY__VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION,
								Mu2consolPlugin.INSTANCE
										.getString("VDTAmbulatorySummaryMedicationsSection"),
								new Object[] { vdtAmbulatorySummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMedicationsSection(VDTAmbulatorySummary)
	 * <em>Get Medications Section</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMedicationsSection(VDTAmbulatorySummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMedicationsSection(VDTAmbulatorySummary)
	 * <em>Get Medications Section</em>}' query operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getMedicationsSection(VDTAmbulatorySummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public static MedicationsSection getMedicationsSection(
			VDTAmbulatorySummary vdtAmbulatorySummary) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.VDT_AMBULATORY_SUMMARY,
					Mu2consolPackage.Literals.VDT_AMBULATORY_SUMMARY
							.getEAllOperations().get(311));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper
						.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(vdtAmbulatorySummary);
	}

} // VDTAmbulatorySummaryOperations