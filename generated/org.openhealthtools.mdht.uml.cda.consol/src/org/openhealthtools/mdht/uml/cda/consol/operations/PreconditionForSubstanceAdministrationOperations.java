/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PreconditionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition For Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationCriterionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration#validatePreconditionForSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionForSubstanceAdministrationOperations extends PreconditionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionForSubstanceAdministrationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCriterionCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.criterion.oclIsUndefined() implies not self.criterion.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCriterionCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionCode(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.criterion.oclIsUndefined() implies not self.criterion.code.oclIsUndefined()
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePreconditionForSubstanceAdministrationCriterionCode(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_CODE,
						 ConsolPlugin.INSTANCE.getString("PreconditionForSubstanceAdministrationCriterionCode"),
						 new Object [] { preconditionForSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCriterionText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.criterion.oclIsUndefined() implies not self.criterion.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCriterionText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionText(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.criterion.oclIsUndefined() implies not self.criterion.text.oclIsUndefined()
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePreconditionForSubstanceAdministrationCriterionText(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_TEXT,
						 ConsolPlugin.INSTANCE.getString("PreconditionForSubstanceAdministrationCriterionText"),
						 new Object [] { preconditionForSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationCriterionValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.criterion.value.oclIsUndefined() or self.criterion.value.isNullFlavorUndefined()) implies (self.criterion.value.oclIsTypeOf(datatypes::CD))";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationCriterionValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Criterion Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationCriterionValue(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.criterion.value.oclIsUndefined() or self.criterion.value.isNullFlavorUndefined()) implies (self.criterion.value.oclIsTypeOf(datatypes::CD))
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePreconditionForSubstanceAdministrationCriterionValue(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_CRITERION_VALUE,
						 ConsolPlugin.INSTANCE.getString("PreconditionForSubstanceAdministrationCriterionValue"),
						 new Object [] { preconditionForSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition For Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionForSubstanceAdministrationTemplateId(PreconditionForSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.25')
	 * @param preconditionForSubstanceAdministration The receiving '<em><b>Precondition For Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePreconditionForSubstanceAdministrationTemplateId(
			PreconditionForSubstanceAdministration preconditionForSubstanceAdministration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preconditionForSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION__PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PreconditionForSubstanceAdministrationTemplateId"),
						 new Object [] { preconditionForSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

} // PreconditionForSubstanceAdministrationOperations
