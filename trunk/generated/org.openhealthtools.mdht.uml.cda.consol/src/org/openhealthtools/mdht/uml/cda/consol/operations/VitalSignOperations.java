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
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignReferenceRangeRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Reference Range Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign#validateVitalSignTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignCodeValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignCodeValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem = '2.16.840.1.113883.6.12'";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignCodeValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignCodeValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.1' xor self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem = '2.16.840.1.113883.6.12'
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignCodeValue(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_CODE_VALUE,
						 ConsolPlugin.INSTANCE.getString("VitalSignCodeValue"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignReferenceRangeRequired(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Reference Range Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignReferenceRangeRequired(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.referenceRange->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignReferenceRangeRequired(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Reference Range Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignReferenceRangeRequired(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.referenceRange->isEmpty()
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignReferenceRangeRequired(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_REFERENCE_RANGE_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("VitalSignReferenceRangeRequired"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignNoObservationRangeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign No Observation Range Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignNoObservationRangeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->forAll(range : cda::ReferenceRange | range.observationRange.code.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignNoObservationRangeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign No Observation Range Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignNoObservationRangeCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.referenceRange->forAll(range : cda::ReferenceRange | range.observationRange.code.code.oclIsUndefined())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignNoObservationRangeCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_NO_OBSERVATION_RANGE_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignNoObservationRangeCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignInformationSource(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInformationSource(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignInformationSource(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInformationSource(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignInformationSource(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_INFORMATION_SOURCE,
						 ConsolPlugin.INSTANCE.getString("VitalSignInformationSource"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTemplateId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.14')
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("VitalSignTemplateId"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMoodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignMoodCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignMoodCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignId(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_ID,
						 ConsolPlugin.INSTANCE.getString("VitalSignId"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '8310-5' or value.code = '8462-4' or value.code = '8480-6' or value.code = '8287-5' or value.code = '8867-4' or value.code = '8302-2' or value.code = '8306-3' or value.code = '2710-2' or value.code = '9279-1' or value.code = '3141-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '8310-5' or value.code = '8462-4' or value.code = '8480-6' or value.code = '8287-5' or value.code = '8867-4' or value.code = '8302-2' or value.code = '8306-3' or value.code = '2710-2' or value.code = '9279-1' or value.code = '3141-9')))
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignStatusCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignStatusCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignStatusCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignEffectiveTime(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignEffectiveTime(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("VitalSignEffectiveTime"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignValue(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignValue(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_VALUE,
						 ConsolPlugin.INSTANCE.getString("VitalSignValue"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignInterpretationCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignInterpretationCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_INTERPRETATION_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignInterpretationCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignMethodCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignMethodCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_METHOD_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignMethodCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignTargetSiteCode(VitalSign, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
	 * @param vitalSign The receiving '<em><b>Vital Sign</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateVitalSignTargetSiteCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGN);
			try {
				VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vitalSign)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.VITAL_SIGN__VITAL_SIGN_TARGET_SITE_CODE,
						 ConsolPlugin.INSTANCE.getString("VitalSignTargetSiteCode"),
						 new Object [] { vitalSign }));
			}
			return false;
		}
		return true;
	}

} // VitalSignOperations