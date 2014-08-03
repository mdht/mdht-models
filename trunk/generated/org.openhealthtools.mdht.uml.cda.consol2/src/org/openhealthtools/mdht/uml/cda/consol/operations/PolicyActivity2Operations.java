/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity Date Of Birth In SDT Cbirth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity SDTC Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivity2PolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2#validatePolicyActivityCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivity2Operations extends PolicyActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Payer Policy Activity Payer Payer Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_PAYER_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Payer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87'))->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Payer Payer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2PolicyActivityPayerPayerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.110'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Guarantor Policy Activity Guarantor Guarantor Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.PolicyActivityGuarantorGuarantorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_GUARANTOR_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Guarantor Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88'))->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Guarantor Guarantor Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity Date Of Birth In SDT Cbirth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity Date Of Birth In SDT Cbirth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_DATE_OF_BIRTH_IN_SDT_CBIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity SDTC Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((sDTCBirthTime.oclIsUndefined() or sDTCBirthTime.isNullFlavorUndefined()) implies (not sDTCBirthTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Coverage Role Coverage Playing Entity SDTC Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_SDTC_BIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Coverage Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			PolicyActivity2 policyActivity2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_COVERAGE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivity2PolicyActivityCoverageCoverageRole(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Coverage Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityCoverageCoverageRole(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivity2PolicyActivityCoverageCoverageRole(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Policy Activity Coverage Coverage Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivity2PolicyActivityCoverageCoverageRole(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePolicyActivity2PolicyActivityCoverageCoverageRole(PolicyActivity2 policyActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(policyActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY2_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE,
						ConsolPlugin.INSTANCE.getString("PolicyActivity2PolicyActivityCoverageCoverageRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityTemplateId(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.61.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityTemplateId(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityTemplateId(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityTemplateId(PolicyActivity2 policyActivity2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PolicyActivityTemplateId"), new Object[] { policyActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityPayer(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayer(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.87'))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityPayer(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityPayer(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityPayer(PolicyActivity2 policyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY_PAYER,
					ConsolPlugin.INSTANCE.getString("PolicyActivityPayer"), new Object[] { policyActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityGuarantor(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantor(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.88'))->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityGuarantor(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityGuarantor(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityGuarantor(PolicyActivity2 policyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY_GUARANTOR,
					ConsolPlugin.INSTANCE.getString("PolicyActivityGuarantor"), new Object[] { policyActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePolicyActivityCoverage(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverage(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validatePolicyActivityCoverage(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePolicyActivityCoverage(PolicyActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param policyActivity2 The receiving '<em><b>Policy Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePolicyActivityCoverage(PolicyActivity2 policyActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.POLICY_ACTIVITY2);
			try {
				VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			policyActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.POLICY_ACTIVITY2__POLICY_ACTIVITY_COVERAGE,
					ConsolPlugin.INSTANCE.getString("PolicyActivityCoverage"), new Object[] { policyActivity2 }));
			}

			return false;
		}
		return true;
	}

} // PolicyActivity2Operations
