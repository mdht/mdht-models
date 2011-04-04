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
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultReferenceRangeRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Reference Range Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultValuePresence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Result#validateResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Method Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultReferenceRangeRequired(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Reference Range Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultReferenceRangeRequired(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.referenceRange->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateResultReferenceRangeRequired(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Reference Range Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultReferenceRangeRequired(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.referenceRange->isEmpty()
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultReferenceRangeRequired(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_REFERENCE_RANGE_REQUIRED,
						 ConsolPlugin.INSTANCE.getString("ResultReferenceRangeRequired"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultNoObservationRangeCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Observation Range Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultNoObservationRangeCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.referenceRange->forAll(range : cda::ReferenceRange | range.observationRange.code.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultNoObservationRangeCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result No Observation Range Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultNoObservationRangeCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.referenceRange->forAll(range : cda::ReferenceRange | range.observationRange.code.code.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultNoObservationRangeCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_NO_OBSERVATION_RANGE_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultNoObservationRangeCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultInformationSource(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultInformationSource(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultInformationSource(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultInformationSource(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultInformationSource(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_INFORMATION_SOURCE,
						 ConsolPlugin.INSTANCE.getString("ResultInformationSource"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.moodCode = vocab::x_ActMoodDocumentObservation::EVN or self.moodCode = vocab::x_ActMoodDocumentObservation::EVN)"+
"    implies (not self.value->isEmpty()) and"+
"  (self.moodCode = vocab::x_ActMoodDocumentObservation::INT or self.moodCode = vocab::x_ActMoodDocumentObservation::PRP)"+
"   implies (self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValuePresence(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.moodCode = vocab::x_ActMoodDocumentObservation::EVN or self.moodCode = vocab::x_ActMoodDocumentObservation::EVN)
	 *     implies (not self.value->isEmpty()) and
	 *   (self.moodCode = vocab::x_ActMoodDocumentObservation::INT or self.moodCode = vocab::x_ActMoodDocumentObservation::PRP)
	 *    implies (self.value->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultValuePresence(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_VALUE_PRESENCE,
						 ConsolPlugin.INSTANCE.getString("ResultValuePresence"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.4.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultTemplateId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.4.2')
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultTemplateId(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ResultTemplateId"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultMoodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultMoodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateResultMoodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultMoodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultMoodCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultMoodCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultId(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultId(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_ID,
						 ConsolPlugin.INSTANCE.getString("ResultId"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultStatusCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultStatusCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultStatusCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultStatusCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultStatusCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultStatusCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultEffectiveTime(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultEffectiveTime(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("ResultEffectiveTime"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultValue(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultValue(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_VALUE,
						 ConsolPlugin.INSTANCE.getString("ResultValue"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultInterpretationCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultInterpretationCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultInterpretationCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultInterpretationCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultInterpretationCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_INTERPRETATION_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultInterpretationCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultMethodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultMethodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultMethodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultMethodCode(Result, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())
	 * @param result The receiving '<em><b>Result</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateResultMethodCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RESULT);
			try {
				VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(result)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.RESULT__RESULT_METHOD_CODE,
						 ConsolPlugin.INSTANCE.getString("ResultMethodCode"),
						 new Object [] { result }));
			}
			return false;
		}
		return true;
	}

} // ResultOperations