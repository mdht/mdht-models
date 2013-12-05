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
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorAssignPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Assign Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentActivityOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityTextReference(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("CommentActivityTextReference"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityTextReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTextReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityTextReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTextReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityTextReferenceValue(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("CommentActivityTextReferenceValue"),
					new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityReferenceValue(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityReferenceValue(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("CommentActivityReferenceValue"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityTemplateId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTemplateId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.64')";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityTemplateId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityTemplateId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityTemplateId(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CommentActivityTemplateId"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityClassCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityClassCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityClassCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityClassCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityClassCode(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("CommentActivityClassCode"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityMoodCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityMoodCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityMoodCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityMoodCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityMoodCode(CommentActivity commentActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("CommentActivityMoodCode"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '48767-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityCode(CommentActivity commentActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_CODE,
					ConsolPlugin.INSTANCE.getString("CommentActivityCode"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityText(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityText(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityText(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityText(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityText(CommentActivity commentActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEXT,
					ConsolPlugin.INSTANCE.getString("CommentActivityText"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityAuthor(CommentActivity commentActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR,
					ConsolPlugin.INSTANCE.getString("CommentActivityAuthor"), new Object[] { commentActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and "
			+ "let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in "
			+ "value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmAddressUseP");
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
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(element | not element.oclIsUndefined() and element.name->size() = 1) or representedOrganization->one(element | not element.oclIsUndefined() and element.name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorHasPersonOrOrganization(
			CommentActivity commentActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorAssignPersonName(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Assign Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorAssignPersonName(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.name->forAll(name | name.oclIsTypeOf(datatypes::PN)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorAssignPersonName(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Assign Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorAssignPersonName(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorAssignPersonName(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ASSIGN_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorAssignPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorAddr(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorAddr(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorAddr(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorAddr(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorAddr(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthorId(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthorId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorTime(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorTime(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorTime(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorTime(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorTime(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_TIME,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityAuthorAssignedAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityAuthorAssignedAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityAuthorAssignedAuthor(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCommentActivityAuthorAssignedAuthor(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(commentActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString("CommentActivityAuthorAssignedAuthor"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // CommentActivityOperations
