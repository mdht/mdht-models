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
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActIdsHaveRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Ids Have Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActNoIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act No Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#validateStudyActSeriesAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Series Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct#getSeriesAct() <em>Get Series Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudyActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActIdsHaveRoot(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Ids Have Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActIdsHaveRoot(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->forAll( not root.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActIdsHaveRoot(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Ids Have Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActIdsHaveRoot(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->forAll( not root.oclIsUndefined() )
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateStudyActIdsHaveRoot(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_IDS_HAVE_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_IDS_HAVE_ROOT,
					ConsolPlugin.INSTANCE.getString("StudyActIdsHaveRoot"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActNoIdExtension(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act No Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActNoIdExtension(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->forAll(  extension.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActNoIdExtension(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act No Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActNoIdExtension(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->forAll(  extension.oclIsUndefined() )
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateStudyActNoIdExtension(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_NO_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_NO_ID_EXTENSION,
					ConsolPlugin.INSTANCE.getString("StudyActNoIdExtension"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActTextReference(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateStudyActTextReference(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActTextReference(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActTextReference(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateStudyActTextReference(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("StudyActTextReference"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActTextReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActTextReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActTextReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActTextReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateStudyActTextReferenceValue(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("StudyActTextReferenceValue"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActReferenceValue(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateStudyActReferenceValue(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("StudyActReferenceValue"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActTemplateId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActTemplateId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActTemplateId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActTemplateId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.6')
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActTemplateId(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("StudyActTemplateId"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActClassCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActClassCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActClassCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActClassCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActClassCode(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("StudyActClassCode"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActMoodCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActMoodCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActMoodCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActMoodCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActMoodCode(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("StudyActMoodCode"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActId(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActId(StudyAct studyAct, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.STUDY_ACT__STUDY_ACT_ID,
					ConsolPlugin.INSTANCE.getString("StudyActId"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '113014' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActCode(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '113014' and value.codeSystem = '1.2.840.10008.2.16.4')
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActCode(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.STUDY_ACT__STUDY_ACT_CODE,
					ConsolPlugin.INSTANCE.getString("StudyActCode"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActEffectiveTime(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActEffectiveTime(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActEffectiveTime(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActEffectiveTime(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActEffectiveTime(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("StudyActEffectiveTime"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActText(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActText(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActText(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActText(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActText(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.STUDY_ACT__STUDY_ACT_TEXT,
					ConsolPlugin.INSTANCE.getString("StudyActText"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStudyActSeriesAct(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Series Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActSeriesAct(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::SeriesAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStudyActSeriesAct(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Act Series Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStudyActSeriesAct(StudyAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::SeriesAct) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStudyActSeriesAct(StudyAct studyAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.STUDY_ACT);
			try {
				VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STUDY_ACT_SERIES_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studyAct)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.STUDY_ACT__STUDY_ACT_SERIES_ACT,
					ConsolPlugin.INSTANCE.getString("StudyActSeriesAct"), new Object[] { studyAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeriesAct(StudyAct) <em>Get Series Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesAct(StudyAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERIES_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SeriesAct))->asSequence()->any(true).oclAsType(consol::SeriesAct)";

	/**
	 * The cached OCL query for the '{@link #getSeriesAct(StudyAct) <em>Get Series Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesAct(StudyAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERIES_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::SeriesAct))->asSequence()->any(true).oclAsType(consol::SeriesAct)
	 * @param studyAct The receiving '<em><b>Study Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static SeriesAct getSeriesAct(StudyAct studyAct) {
		if (GET_SERIES_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.STUDY_ACT, ConsolPackage.Literals.STUDY_ACT.getEAllOperations().get(64));
			try {
				GET_SERIES_ACT__EOCL_QRY = helper.createQuery(GET_SERIES_ACT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SERIES_ACT__EOCL_QRY);
		return (SeriesAct) query.evaluate(studyAct);
	}

} // StudyActOperations
