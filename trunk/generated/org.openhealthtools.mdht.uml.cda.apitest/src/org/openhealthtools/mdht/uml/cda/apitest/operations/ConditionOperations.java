/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.Condition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getIds() <em>Get Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addId() <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addId(org.openhealthtools.mdht.uml.hl7.datatypes.II) <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getCode() <em>Get Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withCode() <em>With Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withCode(org.openhealthtools.mdht.uml.hl7.datatypes.CD) <em>With Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getStatusCode() <em>Get Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withStatusCode() <em>With Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withStatusCode(org.openhealthtools.mdht.uml.hl7.datatypes.CS) <em>With Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#getEffectiveTime() <em>Get Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withEffectiveTime() <em>With Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withEffectiveTime(org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS) <em>With Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withEpisodeObservation() <em>With Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withEpisodeObservation(org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation) <em>With Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addProblemEntry() <em>Add Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#addProblemEntry(org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry) <em>Add Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withTreatingProvider() <em>With Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition#withTreatingProvider(org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider) <em>With Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#validateConditionTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#getProblemEntries() <em>Get Problem Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition#getTreatingProvider() <em>Get Treating Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Act toCDAType(Condition condition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getIds(Condition) <em>Get Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IDS__EOCL_EXP = "self.id.oclAsType(datatypes::II)";
	/**
	 * The cached OCL query for the '{@link #getIds(Condition) <em>Get Ids</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * self.id.oclAsType(datatypes::II)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<II> getIds(Condition condition) {
		if (GET_IDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(1));
			try {
				GET_IDS__EOCL_QRY = helper.createQuery(GET_IDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<II> result = (Collection<II>) query.evaluate(condition);
		return new BasicEList.UnmodifiableEList<II>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain at least one [1..*] id (CONF-148).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * II value = (II) eObject;
	 * getIds().add(value);
	 * return value;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  II addId(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		getIds().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain at least one [1..*] id (CONF-148).
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition addId(Condition condition, II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode(Condition) <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CD)";
	/**
	 * The cached OCL query for the '{@link #getCode(Condition) <em>Get Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * self.code.oclAsType(datatypes::CD)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD getCode(Condition condition) {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(4));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CD) query.evaluate(condition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CD value = (CD) eObject;
	 * setCode(value);
	 * return value;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD withCode(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] code/@nullFlavor = "NA" NA (not applicable) (CONF-149).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition withCode(Condition condition, CD value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStatusCode(Condition) <em>Get Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STATUS_CODE__EOCL_EXP = "self.statusCode.oclAsType(datatypes::CS)";
	/**
	 * The cached OCL query for the '{@link #getStatusCode(Condition) <em>Get Status Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STATUS_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::statusCode.
	 * <p>
	 * The statusCode associated with any concern must be one of the following values:
	 * </p>
	 * <p>
	 * <b>active</b>: A concern that is still being tracked.
	 * <b>suspended</b>: A concern that is active, but which may be set aside. For example, this value might be used to suspend concern
	 * about a patient problem after some period of remission, but before assumption that the concern has been resolved.
	 * <b>aborted</b>: A concern that is no longer actively being tracked, but for reasons other than because the problem was resolved.
	 * This value might be used to mark a concern as being aborted after a patient leaves care against medical advice.
	 * <b>completed</b>:
	 * The problem, allergy or medical state has been resolved and the concern no longer needs to be tracked except for
	 * historical purposes.
	 * </p>
	 * self.statusCode.oclAsType(datatypes::CS)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CS getStatusCode(Condition condition) {
		if (GET_STATUS_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(7));
			try {
				GET_STATUS_CODE__EOCL_QRY = helper.createQuery(GET_STATUS_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STATUS_CODE__EOCL_QRY);
		return (CS) query.evaluate(condition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CS value = (CS) eObject;
	 * setStatusCode(value);
	 * return value;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CS withStatusCode(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CS value = (CS) eObject;
		setStatusCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] statusCode, which SHALL be selected from ValueSet ConcernEntryStatus STATIC.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition withStatusCode(Condition condition, CS value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEffectiveTime(Condition) <em>Get Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::IVL_TS)";
	/**
	 * The cached OCL query for the '{@link #getEffectiveTime(Condition) <em>Get Effective Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EFFECTIVE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::effectiveTime.
	 * The effectiveTime element records the starting and ending times during which the concern was active.
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IVL_TS getEffectiveTime(Condition condition) {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.ICONDITION, DomainPackage.Literals.ICONDITION.getEAllOperations().get(10));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (IVL_TS) query.evaluate(condition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IVL_TS value = (IVL_TS) eObject;
	 * setEffectiveTime(value);
	 * return value;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IVL_TS withEffectiveTime(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IVL_TS value = (IVL_TS) eObject;
		setEffectiveTime(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition withEffectiveTime(Condition condition, IVL_TS value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EpisodeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IEpisodeObservation clinicalStatement = (IEpisodeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IEpisodeObservation withEpisodeObservation(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EpisodeObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IEpisodeObservation clinicalStatement = (IEpisodeObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition MAY contain exactly one [1..1] entryRelationship (CONF-168), such that Contains exactly one [1..1] Episode Observation (templateId: 2.16.840.1.113883.10.20.1.41).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EpisodeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IEpisodeObservation clinicalStatement = (IEpisodeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition withEpisodeObservation(Condition condition, IEpisodeObservation value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EpisodeObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IEpisodeObservation clinicalStatement = (IEpisodeObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Condition Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ConditionEntry");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IProblemEntry clinicalStatement = (IProblemEntry) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry addProblemEntry(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ConditionEntry");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IProblemEntry clinicalStatement = (IProblemEntry) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Condition Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition addProblemEntry(Condition condition, IProblemEntry value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain zero or one [0..1] performer, such that Contains exactly one [1..1] Treating Provider.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TreatingProvider");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * 
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ITreatingProvider withTreatingProvider(Condition condition) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TreatingProvider");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition SHALL contain zero or one [0..1] performer, such that Contains exactly one [1..1] Treating Provider.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TreatingProvider");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICondition withTreatingProvider(Condition condition, ITreatingProvider value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TreatingProvider");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->isEmpty()";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Relationship Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryRelationshipRequired(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryRelationshipRequired(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_ENTRY_RELATIONSHIP_REQUIRED,
						 APITestPlugin.INSTANCE.getString("ConditionEntryRelationshipRequired"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and "+
"  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Subject Of Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionSubjectOfTarget(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionSubjectOfTarget(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_SUBJECT_OF_TARGET,
						 APITestPlugin.INSTANCE.getString("ConditionSubjectOfTarget"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsProblemObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsProblemObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_PROBLEM_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionContainsProblemObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Alert Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsAlertObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsAlertObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_ALERT_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionContainsAlertObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionContainsPatientAwareness(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionContainsPatientAwareness(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CONTAINS_PATIENT_AWARENESS,
						 APITestPlugin.INSTANCE.getString("ConditionContainsPatientAwareness"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()"+
"   and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())"+
"   and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time Low High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTimeLowHigh(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 *    and ((self.statusCode.code = 'completed' or self.statusCode.code = 'aborted') implies not self.effectiveTime.high.oclIsUndefined())
	 *    and ((self.statusCode.code <> 'completed' and self.statusCode.code <> 'aborted') implies self.effectiveTime.high.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEffectiveTimeLowHigh(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EFFECTIVE_TIME_LOW_HIGH,
						 APITestPlugin.INSTANCE.getString("ConditionEffectiveTimeLowHigh"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionHasProviderTreatmentTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(p : cda::Performer2 | p.time.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionHasProviderTreatmentTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME,
						 APITestPlugin.INSTANCE.getString("ConditionHasProviderTreatmentTime"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTemplateId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.7')
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("ConditionTemplateId"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionClassCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionClassCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CLASS_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionClassCode"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionMoodCode(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionMoodCode(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_MOOD_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionMoodCode"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionId(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_ID,
						 APITestPlugin.INSTANCE.getString("ConditionId"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionCodeNullFlavor(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.nullFlavor = vocab::NullFlavor::NA)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionCodeNullFlavor(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_CODE_NULL_FLAVOR,
						 APITestPlugin.INSTANCE.getString("ConditionCodeNullFlavor"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEffectiveTime(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEffectiveTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EFFECTIVE_TIME,
						 APITestPlugin.INSTANCE.getString("ConditionEffectiveTime"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::EpisodeObservation))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEpisodeObservation(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::EpisodeObservation))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEpisodeObservation(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_EPISODE_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEpisodeObservation"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Treating Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionTreatingProvider(Condition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.assignedEntity.oclIsUndefined() and performer.assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionTreatingProvider(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION);
			try {
				VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION__CONDITION_TREATING_PROVIDER,
						 APITestPlugin.INSTANCE.getString("ConditionTreatingProvider"),
						 new Object [] { condition }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IEpisodeObservation))->asSequence()->first().oclAsType(domain::IEpisodeObservation)";
	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(Condition) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::episodeObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IEpisodeObservation))->asSequence()->first().oclAsType(domain::IEpisodeObservation)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IEpisodeObservation getEpisodeObservation(Condition condition) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION, APITestPackage.Literals.CONDITION.getEAllOperations().get(83));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (IEpisodeObservation) query.evaluate(condition);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntries(Condition) <em>Get Problem Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemEntry)).oclAsType(domain::IProblemEntry)";
	/**
	 * The cached OCL query for the '{@link #getProblemEntries(Condition) <em>Get Problem Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::conditionEntry.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemEntry)).oclAsType(domain::IProblemEntry)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<IProblemEntry> getProblemEntries(Condition condition) {
		if (GET_PROBLEM_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION, APITestPackage.Literals.CONDITION.getEAllOperations().get(84));
			try {
				GET_PROBLEM_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IProblemEntry> result = (Collection<IProblemEntry>) query.evaluate(condition);
		return new BasicEList.UnmodifiableEList<IProblemEntry>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getTreatingProvider(Condition) <em>Get Treating Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatingProvider(Condition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TREATING_PROVIDER__EOCL_EXP = "self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(domain::ITreatingProvider))->asSequence()->first().oclAsType(domain::ITreatingProvider)";
	/**
	 * The cached OCL query for the '{@link #getTreatingProvider(Condition) <em>Get Treating Provider</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatingProvider(Condition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TREATING_PROVIDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::Condition::treatingProvider.
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(domain::ITreatingProvider))->asSequence()->first().oclAsType(domain::ITreatingProvider)
	 * @param condition The receiving '<em><b>Condition</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ITreatingProvider getTreatingProvider(Condition condition) {
		if (GET_TREATING_PROVIDER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION, APITestPackage.Literals.CONDITION.getEAllOperations().get(85));
			try {
				GET_TREATING_PROVIDER__EOCL_QRY = helper.createQuery(GET_TREATING_PROVIDER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TREATING_PROVIDER__EOCL_QRY);
		return (ITreatingProvider) query.evaluate(condition);
	}

} // ConditionOperations