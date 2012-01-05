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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SubjectOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Subject</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Adm Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject#validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySubjectOperations extends SubjectOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySubjectOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectClassCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectClassCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.isClassCodeDefined() and self.relatedSubject.classCode = vocab::x_DocumentSubject::PRS";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectClassCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectClassCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.isClassCodeDefined() and self.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectClassCode(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectClassCode"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject->size() = 1 implies self.relatedSubject.code->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject->size() = 1 implies self.relatedSubject.code->size() = 1
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectCode(FamilyHistorySubject familyHistorySubject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectCode"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectCodeValueSet(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectCodeValueSet(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.code->size() = 1 implies self.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectCodeValueSet(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Code Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectCodeValueSet(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.code->size() = 1 implies self.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectCodeValueSet(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_CODE_VALUE_SET,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectCodeValueSet"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubject(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubject(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.subject->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubject(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubject(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectSubject(FamilyHistorySubject familyHistorySubject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectSubject"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Adm Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.subject->size() = 1 implies (self.relatedSubject.subject.administrativeGenderCode->size() = 1 and self.relatedSubject.subject.administrativeGenderCode.codeSystem = '2.16.840.1.113883.5.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Adm Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies (self.relatedSubject.subject.administrativeGenderCode->size() = 1 and self.relatedSubject.subject.administrativeGenderCode.codeSystem = '2.16.840.1.113883.5.1')
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_ADM_GENDER_CODE,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.birthTime->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.birthTime->size() = 1
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_BIRTH_TIME,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectSubjectBirthTime"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedInd->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedInd->size() = 1
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_IND,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectSubjectDeceasedInd"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedTime->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Subject Related Subject Subject Deceased Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(FamilyHistorySubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedTime->size() = 1
	 * @param familyHistorySubject The receiving '<em><b>Family History Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(
			FamilyHistorySubject familyHistorySubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT);
			try {
				VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistorySubject)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FAMILY_HISTORY_SUBJECT__FAMILY_HISTORY_SUBJECT_RELATED_SUBJECT_SUBJECT_DECEASED_TIME,
					ConsolPlugin.INSTANCE.getString("FamilyHistorySubjectRelatedSubjectSubjectDeceasedTime"),
					new Object[] { familyHistorySubject }));
			}
			return false;
		}
		return true;
	}

} // FamilyHistorySubjectOperations
