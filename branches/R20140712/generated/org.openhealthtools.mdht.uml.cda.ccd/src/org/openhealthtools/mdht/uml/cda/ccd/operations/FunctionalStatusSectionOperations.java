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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionIcfCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Icf Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionResultStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Result Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionClinicalStatements(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionClinicalStatements(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryTargets(ccd::ProblemAct)->size() > 0"
			+ "  or self.getEntryTargets(ccd::ResultOrganizer)->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionClinicalStatements(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionClinicalStatements(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionClinicalStatements(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionClinicalStatements"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionObservationCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionObservationCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation) or obs.oclIsKindOf(ccd::ResultObservation))->forAll(ob : cda::Observation| ob.code->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionObservationCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionObservationCode(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionObservationCode(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionObservationCode"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionObservationCodeValueSet(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionObservationCodeValueSet(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation) or obs.oclIsKindOf(ccd::ResultObservation))->forAll(ob : cda::Observation| ob.code.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionObservationCodeValueSet(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionObservationCodeValueSet(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionObservationCodeValueSet(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionObservationCodeValueSet"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionValueDatatype(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Value Datatype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionValueDatatype(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(o | o.value->select(v | v.oclIsKindOf(datatypes::CD)  or  v.oclIsKindOf(datatypes::CE) ) ->isEmpty())->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionValueDatatype(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Value Datatype</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionValueDatatype(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionValueDatatype(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_VALUE_DATATYPE,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionValueDatatype"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionIcfCodeSystem(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Icf Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionIcfCodeSystem(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(o|o.code.codeSystem <> '2.16.840.1.113883.6.254')->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionIcfCodeSystem(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Icf Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionIcfCodeSystem(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionIcfCodeSystem(FunctionalStatusSection functionalStatusSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_ICF_CODE_SYSTEM,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionIcfCodeSystem"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionProblemStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionProblemStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(obs : cda::Observation | (obs.oclIsKindOf(ccd::ResultObservation) or obs.oclIsKindOf(ccd::ProblemObservation)))->forAll(ob : cda::Observation | ob.getObservations()->select(o: cda::Observation | o.oclIsKindOf(ccd::FunctionalStatusObservation))->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionProblemStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionProblemStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionProblemStatusObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionProblemStatusObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionResultStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Result Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionResultStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getObservations()->select(obs : cda::Observation | (obs.oclIsKindOf(ccd::ResultObservation) or obs.oclIsKindOf(ccd::ProblemObservation)))->"
			+ "forAll(ob : cda::Observation | ob.getObservations()->select(o: cda::Observation | o.oclIsKindOf(ccd::FunctionalStatusObservation))->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionResultStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Result Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionResultStatusObservation(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection The receiving '<em><b>Functional Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFunctionalStatusSectionResultStatusObservation(
			FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionResultStatusObservation"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.5')";

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
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
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
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionTemplateId"),
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
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
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
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionCode"),
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
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
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
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionTitle"),
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
			helper.setContext(CCDPackage.Literals.FUNCTIONAL_STATUS_SECTION);
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
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEXT,
					CCDPlugin.INSTANCE.getString("FunctionalStatusSectionText"),
					new Object[] { functionalStatusSection }));
			}

			return false;
		}
		return true;
	}

} // FunctionalStatusSectionOperations
