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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityEffectiveTimeWhenAuthorPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Effective Time When Author Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityHasAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityHasAuthorOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateCommentActivityHasTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityHasTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasTextReference(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityHasTextReference(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_HAS_TEXT_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("CommentActivityHasTextReference"),
						 new Object [] { commentActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityEffectiveTimeWhenAuthorPresent(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Effective Time When Author Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityEffectiveTimeWhenAuthorPresent(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityEffectiveTimeWhenAuthorPresent(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Effective Time When Author Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityEffectiveTimeWhenAuthorPresent(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty() implies not self.effectiveTime.oclIsUndefined()
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityEffectiveTimeWhenAuthorPresent(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT,
						 ConsolPlugin.INSTANCE.getString("CommentActivityEffectiveTimeWhenAuthorPresent"),
						 new Object [] { commentActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityHasAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies (  self.author.assignedAuthor.id ->size() > 0 and self.author.assignedAuthor.addr ->size() > 0 and self.author.assignedAuthor.telecom ->size() > 0)";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityHasAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasAuthorId(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty() implies (  self.author.assignedAuthor.id ->size() > 0 and self.author.assignedAuthor.addr ->size() > 0 and self.author.assignedAuthor.telecom ->size() > 0)
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityHasAuthorId(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_HAS_AUTHOR_ID,
						 ConsolPlugin.INSTANCE.getString("CommentActivityHasAuthorId"),
						 new Object [] { commentActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityHasAuthorOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasAuthorOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.author->isEmpty() implies ( self.author->exists( a : cda::Author | ( (not a.assignedAuthor.assignedPerson.oclIsUndefined()) and not a.assignedAuthor.assignedPerson.name->isEmpty()) or (not a.assignedAuthor.representedOrganization.name->isEmpty())  ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityHasAuthorOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Has Author Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityHasAuthorOrganization(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.author->isEmpty() implies ( self.author->exists( a : cda::Author | ( (not a.assignedAuthor.assignedPerson.oclIsUndefined()) and not a.assignedAuthor.assignedPerson.name->isEmpty()) or (not a.assignedAuthor.representedOrganization.name->isEmpty())  ) )
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityHasAuthorOrganization(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_HAS_AUTHOR_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("CommentActivityHasAuthorOrganization"),
						 new Object [] { commentActivity }));
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
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.64')
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("CommentActivityTemplateId"),
						 new Object [] { commentActivity }));
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
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("CommentActivityClassCode"),
						 new Object [] { commentActivity }));
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
	 * self.moodCode=vocab::x_DocumentActMood::EVN
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("CommentActivityMoodCode"),
						 new Object [] { commentActivity }));
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
	protected static final String VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '48767-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

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
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '48767-8' and value.codeSystem = '2.16.840.1.113883.6.1')
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_CODE,
						 ConsolPlugin.INSTANCE.getString("CommentActivityCode"),
						 new Object [] { commentActivity }));
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
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_TEXT,
						 ConsolPlugin.INSTANCE.getString("CommentActivityText"),
						 new Object [] { commentActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCommentActivityStatusCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityStatusCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateCommentActivityStatusCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCommentActivityStatusCode(CommentActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param commentActivity The receiving '<em><b>Comment Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCommentActivityStatusCode(CommentActivity commentActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMMENT_ACTIVITY);
			try {
				VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("CommentActivityStatusCode"),
						 new Object [] { commentActivity }));
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
	protected static final String VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

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
	 * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))
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
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(commentActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COMMENT_ACTIVITY__COMMENT_ACTIVITY_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("CommentActivityAuthor"),
						 new Object [] { commentActivity }));
			}
			return false;
		}
		return true;
	}

} // CommentActivityOperations
