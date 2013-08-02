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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTargetPatientRole2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTargetPatientRole2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2Addr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocumentOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentTemplateId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocumentTemplateId(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentTemplateId"),
					new Object[] { unstructuredDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTarget(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocumentRecordTarget(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentRecordTarget"),
					new Object[] { unstructuredDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthor(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocumentAuthor(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_AUTHOR,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentAuthor"),
					new Object[] { unstructuredDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentComponent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentComponent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component2 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component2))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentComponent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentComponent(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocumentComponent(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_COMPONENT,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentComponent"),
					new Object[] { unstructuredDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodian(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodian(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodian(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodian(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUnstructuredDocumentCustodian(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			unstructuredDocument)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodian"),
					new Object[] { unstructuredDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentRecordTargetPatientRole2Id(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTargetPatientRole2Id(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentRecordTargetPatientRole2Id(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTargetPatientRole2Id(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentRecordTargetPatientRole2Id(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentRecordTargetPatientRole2Id"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentRecordTargetPatientRole2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTargetPatientRole2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentRecordTargetPatientRole2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentRecordTargetPatientRole2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentRecordTargetPatientRole2(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentRecordTargetPatientRole2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2Addr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2Addr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2Addr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2Addr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentAuthorAssignedAuthor2Addr(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentAuthorAssignedAuthor2Addr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentAuthorAssignedAuthor2Telecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentAuthorAssignedAuthor2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentAuthorAssignedAuthor2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentAuthorAssignedAuthor2(UnstructuredDocument unstructuredDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentAuthorAssignedAuthor2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUnstructuredDocumentCustodianAssignedCustodian2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnstructuredDocumentCustodianAssignedCustodian2(UnstructuredDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param unstructuredDocument The receiving '<em><b>Unstructured Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUnstructuredDocumentCustodianAssignedCustodian2(
			UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(unstructuredDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2,
						ConsolPlugin.INSTANCE.getString("UnstructuredDocumentCustodianAssignedCustodian2"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // UnstructuredDocumentOperations
