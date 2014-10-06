/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   due to inline datatype OCL generation issue     								 
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2Custodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2Component(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2RecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2CustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body ED Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Media Type File Formats</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateUnstructuredDocument2ComponentNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocument2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocument2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2RecordTarget(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTarget(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2RecordTarget(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTarget(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocument2RecordTarget(UnstructuredDocument2 unstructuredDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocument2RecordTarget"),
					new Object[] { unstructuredDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2Custodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2Custodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2Custodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2Custodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocument2Custodian(UnstructuredDocument2 unstructuredDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocument2Custodian"),
					new Object[] { unstructuredDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2Component(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2Component(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2Component(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2Component(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocument2Component(UnstructuredDocument2 unstructuredDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_COMPONENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocument2Component"),
					new Object[] { unstructuredDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2RecordTargetPatientRoleId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTargetPatientRoleId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2RecordTargetPatientRoleId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTargetPatientRoleId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2RecordTargetPatientRoleId(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE_ID,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2RecordTargetPatientRoleId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2RecordTargetPatientRole(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTargetPatientRole(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2RecordTargetPatientRole(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2RecordTargetPatientRole(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2RecordTargetPatientRole(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_RECORD_TARGET_PATIENT_ROLE,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2RecordTargetPatientRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2CustodianAssignedCustodianRepresentedCustodianOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2CustodianAssignedCustodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2CustodianAssignedCustodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2CustodianAssignedCustodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2CustodianAssignedCustodian(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2CustodianAssignedCustodian(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_CUSTODIAN_ASSIGNED_CUSTODIAN,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2CustodianAssignedCustodian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body ED Media Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).nonXMLBody->excluding(null).text->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ( isDefined('mediaType') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body ED Media Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2ComponentNonXMLBodyEDMediaType(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_ED_MEDIA_TYPE,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2ComponentNonXMLBodyEDMediaType"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Media Type File Formats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).nonXMLBody->excluding(null)->reject(not text.mediaType.oclIsUndefined()  implies (text.mediaType = 'application/msword' or text.mediaType = 'application/pdf' or text.mediaType = 'text/plain' or text.mediaType = 'text/rtf' or text.mediaType = 'text/html' or text.mediaType = 'image/gif' or text.mediaType = 'image/tiff' or text.mediaType = 'image/jpeg' or text.mediaType = 'image/png'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Media Type File Formats</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_MEDIA_TYPE_FILE_FORMATS,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2ComponentNonXMLBodyMediaTypeFileFormats"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyText(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyText(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).nonXMLBody->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2ComponentNonXMLBodyText(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBodyText(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2ComponentNonXMLBodyText(
			UnstructuredDocument2 unstructuredDocument2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY_TEXT,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2ComponentNonXMLBodyText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocument2ComponentNonXMLBody(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBody(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(nonXMLBody->one(nonXMLBody : cda::NonXMLBody | not nonXMLBody.oclIsUndefined() and nonXMLBody.oclIsKindOf(cda::NonXMLBody)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocument2ComponentNonXMLBody(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document2 Component Non XML Body</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocument2ComponentNonXMLBody(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocument2ComponentNonXMLBody(UnstructuredDocument2 unstructuredDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT2__UNSTRUCTURED_DOCUMENT2_COMPONENT_NON_XML_BODY,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocument2ComponentNonXMLBody"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.10' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument2 The receiving '<em><b>Unstructured Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(UnstructuredDocument2 unstructuredDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { unstructuredDocument2 }));
			}

			return false;
		}
		return true;
	}

} // UnstructuredDocument2Operations
