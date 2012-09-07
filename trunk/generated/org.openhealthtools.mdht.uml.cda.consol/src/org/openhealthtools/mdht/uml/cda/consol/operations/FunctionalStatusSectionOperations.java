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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionPressureUlcerObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Pressure Ulcer Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNumberOfPressureUlcersObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Number Of Pressure Ulcers Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusResultOrganizers() <em>Get Functional Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusResultOrganizers() <em>Get Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusResultObservations() <em>Get Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusResultObservations() <em>Get Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusProblemObservations() <em>Get Functional Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusProblemObservations() <em>Get Cognitive Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getPressureUlcerObservations() <em>Get Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getNumberOfPressureUlcersObservations() <em>Get Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getHighestPressureUlcerStages() <em>Get Highest Pressure Ulcer Stages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14')
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionTemplateId(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionTemplateId"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionCode(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCode"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionTitle(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTitle(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionTitle(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTitle(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionTitle(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionTitle"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionText(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionText(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionText(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionText(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionText(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionText"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionFunctionalStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionFunctionalStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionFunctionalStatusResultOrganizer(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionFunctionalStatusResultOrganizer"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCognitiveStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCognitiveStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusResultOrganizer(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCognitiveStatusResultOrganizer(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCognitiveStatusResultOrganizer"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionFunctionalStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionFunctionalStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusResultObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionFunctionalStatusResultObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionFunctionalStatusResultObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCognitiveStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCognitiveStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusResultObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusResultObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCognitiveStatusResultObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCognitiveStatusResultObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionFunctionalStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionFunctionalStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusProblemObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionFunctionalStatusProblemObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionFunctionalStatusProblemObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCognitiveStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCognitiveStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCognitiveStatusProblemObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CognitiveStatusProblemObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCognitiveStatusProblemObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCognitiveStatusProblemObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCaregiverCharacteristics(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCaregiverCharacteristics(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CaregiverCharacteristics))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCaregiverCharacteristics(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCaregiverCharacteristics(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CaregiverCharacteristics))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCaregiverCharacteristics(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCaregiverCharacteristics"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionAssessmentScaleObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Assessment Scale Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionAssessmentScaleObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AssessmentScaleObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionAssessmentScaleObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Assessment Scale Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionAssessmentScaleObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AssessmentScaleObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionAssessmentScaleObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionAssessmentScaleObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionNonMedicinalSupplyActivity(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNonMedicinalSupplyActivity(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionNonMedicinalSupplyActivity(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNonMedicinalSupplyActivity(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionNonMedicinalSupplyActivity(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionNonMedicinalSupplyActivity"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionPressureUlcerObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Pressure Ulcer Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionPressureUlcerObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PressureUlcerObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionPressureUlcerObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Pressure Ulcer Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionPressureUlcerObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::PressureUlcerObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionPressureUlcerObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionPressureUlcerObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionNumberOfPressureUlcersObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Number Of Pressure Ulcers Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNumberOfPressureUlcersObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionNumberOfPressureUlcersObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Number Of Pressure Ulcers Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNumberOfPressureUlcersObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionNumberOfPressureUlcersObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionNumberOfPressureUlcersObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionHighestPressureUlcerStage(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Highest Pressure Ulcer Stage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionHighestPressureUlcerStage(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HighestPressureUlcerStage))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionHighestPressureUlcerStage(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Highest Pressure Ulcer Stage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionHighestPressureUlcerStage(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HighestPressureUlcerStage))
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionHighestPressureUlcerStage(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionHighestPressureUlcerStage"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusResultOrganizers(FunctionalStatusSection) <em>Get Functional Status Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)).oclAsType(consol::FunctionalStatusResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusResultOrganizers(FunctionalStatusSection) <em>Get Functional Status Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusResultOrganizer)).oclAsType(consol::FunctionalStatusResultOrganizer)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusResultOrganizer> getFunctionalStatusResultOrganizers(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(71));
			try {
				GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusResultOrganizer> result = (Collection<FunctionalStatusResultOrganizer>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCognitiveStatusResultOrganizers(FunctionalStatusSection) <em>Get Cognitive Status Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getCognitiveStatusResultOrganizers(FunctionalStatusSection) <em>Get Cognitive Status Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultOrganizers(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusResultOrganizer> getCognitiveStatusResultOrganizers(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(72));
			try {
				GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultOrganizer> result = (Collection<CognitiveStatusResultOrganizer>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusResultObservations(FunctionalStatusSection) <em>Get Functional Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)).oclAsType(consol::FunctionalStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusResultObservations(FunctionalStatusSection) <em>Get Functional Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusResultObservation)).oclAsType(consol::FunctionalStatusResultObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusResultObservation> getFunctionalStatusResultObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(73));
			try {
				GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusResultObservation> result = (Collection<FunctionalStatusResultObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCognitiveStatusResultObservations(FunctionalStatusSection) <em>Get Cognitive Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getCognitiveStatusResultObservations(FunctionalStatusSection) <em>Get Cognitive Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusResultObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusResultObservation> getCognitiveStatusResultObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(74));
			try {
				GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultObservation> result = (Collection<CognitiveStatusResultObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusProblemObservations(FunctionalStatusSection) <em>Get Functional Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusProblemObservations(FunctionalStatusSection) <em>Get Functional Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusProblemObservation> getFunctionalStatusProblemObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(75));
			try {
				GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusProblemObservation> result = (Collection<FunctionalStatusProblemObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<FunctionalStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCognitiveStatusProblemObservations(FunctionalStatusSection) <em>Get Cognitive Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getCognitiveStatusProblemObservations(FunctionalStatusSection) <em>Get Cognitive Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCognitiveStatusProblemObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusProblemObservation> getCognitiveStatusProblemObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(76));
			try {
				GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusProblemObservation> result = (Collection<CognitiveStatusProblemObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CognitiveStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(FunctionalStatusSection) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(FunctionalStatusSection) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(77));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentScaleObservations(FunctionalStatusSection) <em>Get Assessment Scale Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentScaleObservations(FunctionalStatusSection) <em>Get Assessment Scale Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentScaleObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AssessmentScaleObservation)).oclAsType(consol::AssessmentScaleObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<AssessmentScaleObservation> getAssessmentScaleObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(78));
			try {
				GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SCALE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentScaleObservation> result = (Collection<AssessmentScaleObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<AssessmentScaleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivities(FunctionalStatusSection) <em>Get Non Medicinal Supply Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivities(FunctionalStatusSection) <em>Get Non Medicinal Supply Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(79));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPressureUlcerObservations(FunctionalStatusSection) <em>Get Pressure Ulcer Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureUlcerObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)).oclAsType(consol::PressureUlcerObservation)";

	/**
	 * The cached OCL query for the '{@link #getPressureUlcerObservations(FunctionalStatusSection) <em>Get Pressure Ulcer Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureUlcerObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)).oclAsType(consol::PressureUlcerObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<PressureUlcerObservation> getPressureUlcerObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(80));
			try {
				GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PressureUlcerObservation> result = (Collection<PressureUlcerObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<PressureUlcerObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPressureUlcersObservations(FunctionalStatusSection) <em>Get Number Of Pressure Ulcers Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)).oclAsType(consol::NumberOfPressureUlcersObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPressureUlcersObservations(FunctionalStatusSection) <em>Get Number Of Pressure Ulcers Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPressureUlcersObservations(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)).oclAsType(consol::NumberOfPressureUlcersObservation)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<NumberOfPressureUlcersObservation> getNumberOfPressureUlcersObservations(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(81));
			try {
				GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumberOfPressureUlcersObservation> result = (Collection<NumberOfPressureUlcersObservation>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<NumberOfPressureUlcersObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHighestPressureUlcerStages(FunctionalStatusSection) <em>Get Highest Pressure Ulcer Stages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStages(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)).oclAsType(consol::HighestPressureUlcerStage)";

	/**
	 * The cached OCL query for the '{@link #getHighestPressureUlcerStages(FunctionalStatusSection) <em>Get Highest Pressure Ulcer Stages</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighestPressureUlcerStages(FunctionalStatusSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)).oclAsType(consol::HighestPressureUlcerStage)
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<HighestPressureUlcerStage> getHighestPressureUlcerStages(
			FunctionalStatusSection functionalStatusSection) {
		if (GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION.getEAllOperations().get(82));
			try {
				GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY = helper.createQuery(GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HighestPressureUlcerStage> result = (Collection<HighestPressureUlcerStage>) query.evaluate(functionalStatusSection);
		return new BasicEList.UnmodifiableEList<HighestPressureUlcerStage>(result.size(), result.toArray());
	}

} // FunctionalStatusSectionOperations
