/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Airbag Deployment Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus#validateAirbagDeploymentStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirbagDeploymentStatusOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirbagDeploymentStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirbagDeploymentStatusTemplateId(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusTemplateId(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.57')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirbagDeploymentStatusTemplateId(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusTemplateId(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airbagDeploymentStatus The receiving '<em><b>Airbag Deployment Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAirbagDeploymentStatusTemplateId(AirbagDeploymentStatus airbagDeploymentStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRBAG_DEPLOYMENT_STATUS);
			try {
				VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			airbagDeploymentStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.AIRBAG_DEPLOYMENT_STATUS__AIRBAG_DEPLOYMENT_STATUS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("AirbagDeploymentStatusTemplateId"),
					new Object[] { airbagDeploymentStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirbagDeploymentStatusCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67500-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirbagDeploymentStatusCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airbagDeploymentStatus The receiving '<em><b>Airbag Deployment Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAirbagDeploymentStatusCode(AirbagDeploymentStatus airbagDeploymentStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRBAG_DEPLOYMENT_STATUS);
			try {
				VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			airbagDeploymentStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.AIRBAG_DEPLOYMENT_STATUS__AIRBAG_DEPLOYMENT_STATUS_CODE,
					EmspcrPlugin.INSTANCE.getString("AirbagDeploymentStatusCode"),
					new Object[] { airbagDeploymentStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirbagDeploymentStatusValue(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusValue(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17384-1' or value.code = 'LA17385-8' or value.code = 'LA17386-6' or value.code = 'LA17387-4' or value.code = 'LA17388-2' or value.code = 'LA46-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAirbagDeploymentStatusValue(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusValue(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airbagDeploymentStatus The receiving '<em><b>Airbag Deployment Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAirbagDeploymentStatusValue(AirbagDeploymentStatus airbagDeploymentStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRBAG_DEPLOYMENT_STATUS);
			try {
				VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			airbagDeploymentStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.AIRBAG_DEPLOYMENT_STATUS__AIRBAG_DEPLOYMENT_STATUS_VALUE,
					EmspcrPlugin.INSTANCE.getString("AirbagDeploymentStatusValue"),
					new Object[] { airbagDeploymentStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAirbagDeploymentStatusMoodCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusMoodCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAirbagDeploymentStatusMoodCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airbag Deployment Status Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAirbagDeploymentStatusMoodCode(AirbagDeploymentStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param airbagDeploymentStatus The receiving '<em><b>Airbag Deployment Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAirbagDeploymentStatusMoodCode(AirbagDeploymentStatus airbagDeploymentStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.AIRBAG_DEPLOYMENT_STATUS);
			try {
				VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			airbagDeploymentStatus)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.AIRBAG_DEPLOYMENT_STATUS__AIRBAG_DEPLOYMENT_STATUS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("AirbagDeploymentStatusMoodCode"),
					new Object[] { airbagDeploymentStatus }));
			}

			return false;
		}
		return true;
	}

} // AirbagDeploymentStatusOperations
