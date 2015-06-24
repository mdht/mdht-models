/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateContinuityOfCareDocumentAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentCodeP(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE_P,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentCodeP"),
					new Object[] { continuityOfCareDocument }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentCodeP", passToken);
				}
				passToken.add(continuityOfCareDocument);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentCode(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(continuityOfCareDocument)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentCode"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentLanguageCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentLanguageCode"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOf(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOf(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOf(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOf(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentDocumentationOf(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOf"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentAuthor(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_AUTHOR,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAuthor"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Allergies Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAllergiesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentAllergiesSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALLERGIES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAllergiesSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentMedicationsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentMedicationsSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentProblemSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentProblemSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentProceduresSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentProceduresSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentResultsSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentResultsSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentAdvanceDirectivesSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAdvanceDirectivesSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentEncountersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentEncountersSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentFamilyHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentFamilyHistorySection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentFunctionalStatusSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentFunctionalStatusSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentImmunizationsSectionEntriesOptional(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentImmunizationsSectionEntriesOptional"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentMedicalEquipmentSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentMedicalEquipmentSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentPayersSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentPayersSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentPlanOfCareSection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentPlanOfCareSection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentSocialHistorySection(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentSocialHistorySection"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocumentVitalSignsSectionEntriesOptional(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentVitalSignsSectionEntriesOptional"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HIGH,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeHigh"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTimeLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(id->exists(root='2.16.840.1.113883.4.6'))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (true))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (true))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventClassCode(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEventPerformer(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEventPerformer"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEvent(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEvent(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentDocumentationOfServiceEvent(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentDocumentationOfServiceEvent(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentDocumentationOfServiceEvent(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Assigned Person Or Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not assignedPerson.oclIsUndefined()) or (not representedOrganization.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Assigned Person Or Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Represent Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not representedOrganization.oclIsUndefined() and assignedPerson.oclIsUndefined() and assignedAuthoringDevice.oclIsUndefined()) implies id->exists(id | not id.isNullFlavorUndefined() and id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author Has Represent Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAuthorAssignedAuthorHasRepresentOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocumentAuthorAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocumentAuthorAssignedAuthor(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocumentAuthorAssignedAuthor(
			ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(continuityOfCareDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentContinuityOfCareDocumentAuthorAssignedAuthor"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(ContinuityOfCareDocument) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(ContinuityOfCareDocument) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(332));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ContinuityOfCareDocument) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection))->asSequence()->any(true).oclAsType(consol::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ContinuityOfCareDocument) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSection getMedicationsSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(333));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ContinuityOfCareDocument) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ContinuityOfCareDocument) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(334));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ContinuityOfCareDocument) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection))->asSequence()->any(true).oclAsType(consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ContinuityOfCareDocument) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(335));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ContinuityOfCareDocument) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection))->asSequence()->any(true).oclAsType(consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ContinuityOfCareDocument) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(336));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection(ContinuityOfCareDocument) <em>Get Advance Directives Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection))->asSequence()->any(true).oclAsType(consol::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection(ContinuityOfCareDocument) <em>Get Advance Directives Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdvanceDirectivesSection getAdvanceDirectivesSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(337));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION__EOCL_QRY);
		return (AdvanceDirectivesSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection(ContinuityOfCareDocument) <em>Get Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection))->asSequence()->any(true).oclAsType(consol::EncountersSection)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection(ContinuityOfCareDocument) <em>Get Encounters Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EncountersSection getEncountersSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_ENCOUNTERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(338));
			try {
				GET_ENCOUNTERS_SECTION__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION__EOCL_QRY);
		return (EncountersSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ContinuityOfCareDocument) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ContinuityOfCareDocument) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection getFamilyHistorySection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(339));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(ContinuityOfCareDocument) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(ContinuityOfCareDocument) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection getFunctionalStatusSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(340));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(ContinuityOfCareDocument) <em>Get Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(ContinuityOfCareDocument) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(341));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(ContinuityOfCareDocument) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->any(true).oclAsType(consol::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(ContinuityOfCareDocument) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicalEquipmentSection getMedicalEquipmentSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(342));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection(ContinuityOfCareDocument) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->any(true).oclAsType(consol::PayersSection)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection(ContinuityOfCareDocument) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PayersSection getPayersSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(343));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ContinuityOfCareDocument) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ContinuityOfCareDocument) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfCareSection getPlanOfCareSection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(344));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ContinuityOfCareDocument) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ContinuityOfCareDocument) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(345));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(ContinuityOfCareDocument) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(ContinuityOfCareDocument) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ContinuityOfCareDocument)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(
			ContinuityOfCareDocument continuityOfCareDocument) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT.getEAllOperations().get(346));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(continuityOfCareDocument);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument The receiving '<em><b>Continuity Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(ContinuityOfCareDocument continuityOfCareDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			continuityOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocumentGeneralHeaderConstraintsTemplateId"),
					new Object[] { continuityOfCareDocument }));
			}

			return false;
		}
		return true;
	}

} // ContinuityOfCareDocumentOperations
