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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#validateCoverageActivityPolicyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity#getPolicyActivity() <em>Get Policy Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageActivityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.60')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityTemplateId(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.60')
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCoverageActivityTemplateId(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CoverageActivityTemplateId"), new Object[] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PolicyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageActivityPolicyActivity(CoverageActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PolicyActivity))
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCoverageActivityPolicyActivity(CoverageActivity coverageActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ACTIVITY);
			try {
				VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_POLICY_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("CoverageActivityPolicyActivity"),
					new Object[] { coverageActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPolicyActivity(CoverageActivity) <em>Get Policy Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyActivity(CoverageActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POLICY_ACTIVITY__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity))->asSequence()->first().oclAsType(consol::PolicyActivity)";

	/**
	 * The cached OCL query for the '{@link #getPolicyActivity(CoverageActivity) <em>Get Policy Activity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyActivity(CoverageActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POLICY_ACTIVITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity))->asSequence()->first().oclAsType(consol::PolicyActivity)
	 * @param coverageActivity The receiving '<em><b>Coverage Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PolicyActivity getPolicyActivity(CoverageActivity coverageActivity) {
		if (GET_POLICY_ACTIVITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.COVERAGE_ACTIVITY,
				ConsolPackage.Literals.COVERAGE_ACTIVITY.getEAllOperations().get(51));
			try {
				GET_POLICY_ACTIVITY__EOCL_QRY = helper.createQuery(GET_POLICY_ACTIVITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POLICY_ACTIVITY__EOCL_QRY);
		return (PolicyActivity) query.evaluate(coverageActivity);
	}

} // CoverageActivityOperations
