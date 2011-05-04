/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.AgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Age Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#getValue() <em>Get Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#withValue() <em>With Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation#withValue(org.openhealthtools.mdht.uml.hl7.datatypes.ANY) <em>With Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.AgeObservation#validateAgeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgeObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgeObservationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Observation toCDAType(AgeObservation ageObservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getValue(AgeObservation) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue(AgeObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VALUE__EOCL_EXP = "self.value.oclAsType(datatypes::ANY)";
	/**
	 * The cached OCL query for the '{@link #getValue(AgeObservation) <em>Get Value</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue(AgeObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VALUE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * Valued using appropriate datatype.
	 * self.value.oclAsType(datatypes::ANY)
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ANY getValue(AgeObservation ageObservation) {
		if (GET_VALUE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IAGE_OBSERVATION, DomainPackage.Literals.IAGE_OBSERVATION.getEAllOperations().get(1));
			try {
				GET_VALUE__EOCL_QRY = helper.createQuery(GET_VALUE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VALUE__EOCL_QRY);
		return (ANY) query.evaluate(ageObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Age Observation SHALL contain exactly one [1..1] value (CONF-231).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ANY");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ANY value = (ANY) eObject;
	 * getValues().add(value);
	 * return value;
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ANY withValue(AgeObservation ageObservation) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ANY");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ANY value = (ANY) eObject;
		getValues().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Age Observation SHALL contain exactly one [1..1] value (CONF-231).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ANY");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IAgeObservation withValue(AgeObservation ageObservation, ANY value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ANY");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationRelatedSubjectBirthTime(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Related Subject Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationRelatedSubjectBirthTime(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationRelatedSubjectBirthTime(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Related Subject Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationRelatedSubjectBirthTime(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.subject.relatedSubject.subject.birthTime.oclIsUndefined()
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationRelatedSubjectBirthTime(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME,
						 APITestPlugin.INSTANCE.getString("AgeObservationRelatedSubjectBirthTime"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationTemplateId(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationTemplateId(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.38')";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationTemplateId(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationTemplateId(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.38')
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationTemplateId(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("AgeObservationTemplateId"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationClassCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationClassCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationClassCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationClassCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationClassCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE,
						 APITestPlugin.INSTANCE.getString("AgeObservationClassCode"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationMoodCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationMoodCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationMoodCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationMoodCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationMoodCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE,
						 APITestPlugin.INSTANCE.getString("AgeObservationMoodCode"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '397659008' and value.codeSystem = '2.16.840.1.113883.6.96'))";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '397659008' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_CODE,
						 APITestPlugin.INSTANCE.getString("AgeObservationCode"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationStatusCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationStatusCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationStatusCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationStatusCode(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationStatusCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE,
						 APITestPlugin.INSTANCE.getString("AgeObservationStatusCode"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgeObservationValue(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationValue(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";
	/**
	 * The cached OCL invariant for the '{@link #validateAgeObservationValue(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Age Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgeObservationValue(AgeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)
	 * @param ageObservation The receiving '<em><b>Age Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgeObservationValue(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.AGE_OBSERVATION);
			try {
				VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ageObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.AGE_OBSERVATION__AGE_OBSERVATION_VALUE,
						 APITestPlugin.INSTANCE.getString("AgeObservationValue"),
						 new Object [] { ageObservation }));
			}
			return false;
		}
		return true;
	}

} // AgeObservationOperations