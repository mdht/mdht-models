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
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IComment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getIds() <em>Get Ids</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#addId() <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#addId(org.openhealthtools.mdht.uml.hl7.datatypes.II) <em>Add Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getProblemType() <em>Get Problem Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemType() <em>With Problem Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemType(org.openhealthtools.mdht.uml.hl7.datatypes.CD) <em>With Problem Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getProblemName() <em>Get Problem Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemName() <em>With Problem Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemName(org.openhealthtools.mdht.uml.hl7.datatypes.ED) <em>With Problem Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getProblemDate() <em>Get Problem Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemDate() <em>With Problem Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemDate(org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS) <em>With Problem Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#getProblemCode() <em>Get Problem Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemCode() <em>With Problem Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemCode(org.openhealthtools.mdht.uml.hl7.datatypes.CD) <em>With Problem Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withAgeAtOnset() <em>With Age At Onset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withAgeAtOnset(org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation) <em>With Age At Onset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withSeverity() <em>With Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withSeverity(org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity) <em>With Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemStatus() <em>With Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withProblemStatus(org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation) <em>With Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withHealthStatusObservation() <em>With Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withHealthStatusObservation(org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation) <em>With Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#addComment() <em>Add Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#addComment(org.openhealthtools.mdht.uml.cda.apitest.domain.IComment) <em>Add Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withCauseOfDeath() <em>With Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry#withCauseOfDeath(org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation) <em>With Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryHasUnknownResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntrySeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#validateConditionEntryCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getAgeAtOnset() <em>Get Age At Onset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getProblemStatus() <em>Get Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry#getCauseOfDeath() <em>Get Cause Of Death</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionEntryOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  Observation toCDAType(ConditionEntry conditionEntry) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getIds(ConditionEntry) <em>Get Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IDS__EOCL_EXP = "self.id.oclAsType(datatypes::II)";
	/**
	 * The cached OCL query for the '{@link #getIds(ConditionEntry) <em>Get Ids</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::id.
	 * The specific observation being recorded must have an identifier (&lt;id>) that shall be provided for tracking purposes. If the source EMR does not or cannot supply an intrinsic identifier, then a GUID shall be provided as the root, with no extension (e.g., &lt;id root='CE1215CD-69EC-4C7B-805F-569233C5E159'/>). At least one identifier must be present, more than one may appear.
	 * self.id.oclAsType(datatypes::II)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<II> getIds(ConditionEntry conditionEntry) {
		if (GET_IDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(1));
			try {
				GET_IDS__EOCL_QRY = helper.createQuery(GET_IDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<II> result = (Collection<II>) query.evaluate(conditionEntry);
		return new BasicEList.UnmodifiableEList<II>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * II value = (II) eObject;
	 * getIds().add(value);
	 * return value;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  II addId(ConditionEntry conditionEntry) {
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
	 * APITest Condition Entry SHALL contain at least one [1..*] id.
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry addId(ConditionEntry conditionEntry, II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemType(ConditionEntry) <em>Get Problem Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_TYPE__EOCL_EXP = "self.code.oclAsType(datatypes::CD)";
	/**
	 * The cached OCL query for the '{@link #getProblemType(ConditionEntry) <em>Get Problem Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemType(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::code.
	 * This is a fixed value indicating the level of medical judgment used to determine the existence of a problem.
	 * self.code.oclAsType(datatypes::CD)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD getProblemType(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_TYPE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(4));
			try {
				GET_PROBLEM_TYPE__EOCL_QRY = helper.createQuery(GET_PROBLEM_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_TYPE__EOCL_QRY);
		return (CD) query.evaluate(conditionEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CD value = (CD) eObject;
	 * setCode(value);
	 * return value;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD withProblemType(ConditionEntry conditionEntry) {
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
	 * APITest Condition Entry SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.2 Problem Type STATIC 1.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withProblemType(ConditionEntry conditionEntry, CD value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemName(ConditionEntry) <em>Get Problem Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_NAME__EOCL_EXP = "self.text.oclAsType(datatypes::ED)";
	/**
	 * The cached OCL query for the '{@link #getProblemName(ConditionEntry) <em>Get Problem Name</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemName(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_NAME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * <p>This is a text description of the problem suffered.</p>
	 * <p>The &lt;text> element is required and points to the text describing the problem being recorded; including any dates, comments, et cetera. The &lt;reference> contains a URI in value attribute. This URI points to the free text description of the problem in the document that is being described.</p>
	 * self.text.oclAsType(datatypes::ED)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ED getProblemName(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_NAME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(7));
			try {
				GET_PROBLEM_NAME__EOCL_QRY = helper.createQuery(GET_PROBLEM_NAME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_NAME__EOCL_QRY);
		return (ED) query.evaluate(conditionEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ED value = (ED) eObject;
	 * setText(value);
	 * return value;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ED withProblemName(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ED value = (ED) eObject;
		setText(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] text.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withProblemName(ConditionEntry conditionEntry, ED value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemDate(ConditionEntry) <em>Get Problem Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDate(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_DATE__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::IVL_TS)";
	/**
	 * The cached OCL query for the '{@link #getProblemDate(ConditionEntry) <em>Get Problem Date</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDate(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_DATE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::effectiveTime.
	 * <p>This is the range of time of which the problem was active for the patient or subject.</p>
	 * 
	 * <p>The &lt;effectiveTime> of this &lt;observation> is the time interval over which the &lt;observation> is known to be true. The &lt;low> and &lt;high> values should be no more precise than known, but as precise as possible. While CDA allows for multiple mechanisms to record this time interval (e.g., by low and high values, low and width, high and width, or center point and width), we are constraining Medical summaries to use only the low/high form. The &lt;low> value is the earliest point for which the condition is known to have existed. The &lt;high> value, when present, indicates the time at which the observation was no longer known to be true. Thus, the implication is made that if the &lt;high> value is specified, that the observation was no longer seen after this time, and it thus represents the date of resolution of the problem. Similarly, the &lt;low> value may seem to represent onset of the problem. Neither of these statements is necessarily precise, as the &lt;low> and &lt;high> values may represent only an approximation of the true onset and resolution (respectively) times. For example, it may be the case that onset occurred prior to the &lt;low> value, but no observation may have been possible before that time to discern whether the condition existed prior to that time. The &lt;low> value should normally be present. There are exceptions, such as for the case where the patient may be able to report that they had chicken pox, but are unsure when. In this case, the &lt;effectiveTime> element shall have a &lt;low> element with a nullFlavor attribute set to 'UNK'. The &lt;high> value need not be present when the observation is about a state of the patient that is unlikely to change (e.g., the diagnosis of an incurable disease).</p>
	 * self.effectiveTime.oclAsType(datatypes::IVL_TS)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IVL_TS getProblemDate(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_DATE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(10));
			try {
				GET_PROBLEM_DATE__EOCL_QRY = helper.createQuery(GET_PROBLEM_DATE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_DATE__EOCL_QRY);
		return (IVL_TS) query.evaluate(conditionEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IVL_TS value = (IVL_TS) eObject;
	 * setEffectiveTime(value);
	 * return value;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IVL_TS withProblemDate(ConditionEntry conditionEntry) {
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
	 * APITest Condition Entry SHOULD contain exactly one [1..1] effectiveTime.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withProblemDate(ConditionEntry conditionEntry, IVL_TS value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemCode(ConditionEntry) <em>Get Problem Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCode(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_CODE__EOCL_EXP = "self.value.oclAsType(datatypes::CD)";
	/**
	 * The cached OCL query for the '{@link #getProblemCode(ConditionEntry) <em>Get Problem Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemCode(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * This value is a code describing the problem according to a specific vocabulary of problems.
	 * self.value.oclAsType(datatypes::CD)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD getProblemCode(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DomainPackage.Literals.IPROBLEM_ENTRY, DomainPackage.Literals.IPROBLEM_ENTRY.getEAllOperations().get(13));
			try {
				GET_PROBLEM_CODE__EOCL_QRY = helper.createQuery(GET_PROBLEM_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_CODE__EOCL_QRY);
		return (CD) query.evaluate(conditionEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1, where its data type is CD.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * CD value = (CD) eObject;
	 * getValues().add(value);
	 * return value;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  CD withProblemCode(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		getValues().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry SHALL contain exactly one [1..1] value, which SHALL be selected from ValueSet 2.16.840.1.113883.3.88.12.3221.7.4 Problem STATIC 1, where its data type is CD.
	 * org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
	 * org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withProblemCode(ConditionEntry conditionEntry, CD value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IAgeObservation clinicalStatement = (IAgeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IAgeObservation withAgeAtOnset(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IAgeObservation clinicalStatement = (IAgeObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship (CONF-160), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Age Observation (templateId: 2.16.840.1.113883.10.20.1.38).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IAgeObservation clinicalStatement = (IAgeObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withAgeAtOnset(ConditionEntry conditionEntry, IAgeObservation value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AgeObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IAgeObservation clinicalStatement = (IAgeObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ISeverity clinicalStatement = (ISeverity) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ISeverity withSeverity(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ISeverity clinicalStatement = (ISeverity) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Severity (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ISeverity clinicalStatement = (ISeverity) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withSeverity(ConditionEntry conditionEntry, ISeverity value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Severity");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ISeverity clinicalStatement = (ISeverity) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemStatusObservation withProblemStatus(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Problem Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.1).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withProblemStatus(ConditionEntry conditionEntry, IProblemStatusObservation value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IProblemStatusObservation clinicalStatement = (IProblemStatusObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IHealthStatusObservation withHealthStatusObservation(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="REFR" REFR (refers to), and Contains exactly one [1..1] Health Status Observation (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.1.2).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withHealthStatusObservation(ConditionEntry conditionEntry, IHealthStatusObservation value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HealthStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IHealthStatusObservation clinicalStatement = (IHealthStatusObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Comment");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * IComment clinicalStatement = (IComment) eObject;
	 * clinicalStatement.init();
	 * addAct((org.openhealthtools.mdht.uml.cda.Act)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IComment addComment(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Comment");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IComment clinicalStatement = (IComment) eObject;
		clinicalStatement.init();
		addAct((org.openhealthtools.mdht.uml.cda.Act)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or more [0..*] entryRelationship, such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Comment (templateId: 2.16.840.1.113883.3.88.11.83.11).
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry addComment(ConditionEntry conditionEntry, IComment value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return clinicalStatement;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICauseOfDeathObservation withCauseOfDeath(ConditionEntry conditionEntry) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return clinicalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APITest Condition Entry MAY contain zero or one [0..1] entryRelationship, such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Cause Of Death Observation (templateId: 2.16.840.1.113883.10.20.1.42).
	 * org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
	 * org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
	 * org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
	 * ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
	 * clinicalStatement.init();
	 * addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
	 * return this;
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemEntry withCauseOfDeath(ConditionEntry conditionEntry, ICauseOfDeathObservation value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CauseOfDeathObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ICauseOfDeathObservation clinicalStatement = (ICauseOfDeathObservation) eObject;
		clinicalStatement.init();
		addObservation((org.openhealthtools.mdht.uml.cda.Observation)clinicalStatement);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryInformationSource(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryInformationSource(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_INFORMATION_SOURCE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryInformationSource"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryContainsPatientAwareness(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryContainsPatientAwareness(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS,
						 APITestPlugin.INSTANCE.getString("ConditionEntryContainsPatientAwareness"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasTextReference(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryHasTextReference(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_TEXT_REFERENCE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryHasTextReference"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd='true')";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCommentInversionInd(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->forAll(rel : cda::EntryRelationship | (not rel.act.oclIsUndefined() and rel.act.oclIsKindOf(ihe::Comment)) implies rel.inversionInd='true')
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryCommentInversionInd(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_COMMENT_INVERSION_IND,
						 APITestPlugin.INSTANCE.getString("ConditionEntryCommentInversionInd"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasOnsetDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.low.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryHasOnsetDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryHasResolutionDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHasUnknownResolutionDate(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.high.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryHasUnknownResolutionDate"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryTemplateId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.5')
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryTemplateId(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_TEMPLATE_ID,
						 APITestPlugin.INSTANCE.getString("ConditionEntryTemplateId"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryMoodCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryMoodCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_MOOD_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryMoodCode"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryId(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryId(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_ID,
						 APITestPlugin.INSTANCE.getString("ConditionEntryId"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '404684003' or value.code = '409586006' or value.code = '282291009' or value.code = '64572001' or value.code = '248536006' or value.code = '418799008' or value.code = '55607006')))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryCode"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryText(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryText(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_TEXT,
						 APITestPlugin.INSTANCE.getString("ConditionEntryText"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryStatusCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryStatusCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_STATUS_CODE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryStatusCode"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryEffectiveTime(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME,
						 APITestPlugin.INSTANCE.getString("ConditionEntryEffectiveTime"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_VALUE,
						 APITestPlugin.INSTANCE.getString("ConditionEntryValue"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryAgeObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::AgeObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryAgeObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_AGE_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEntryAgeObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::Severity))";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntrySeverity(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::Severity))
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntrySeverity(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_SEVERITY,
						 APITestPlugin.INSTANCE.getString("ConditionEntrySeverity"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryProblemStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::ProblemStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryProblemStatusObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEntryProblemStatusObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryHealthStatusObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::HealthStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryHealthStatusObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEntryHealthStatusObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(apitest::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryComment(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(apitest::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryComment(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_COMMENT,
						 APITestPlugin.INSTANCE.getString("ConditionEntryComment"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";
	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCauseOfDeathObservation(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(apitest::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryCauseOfDeathObservation(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_ENTRY__CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION,
						 APITestPlugin.INSTANCE.getString("ConditionEntryCauseOfDeathObservation"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAgeAtOnset(ConditionEntry) <em>Get Age At Onset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtOnset(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AGE_AT_ONSET__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)";
	/**
	 * The cached OCL query for the '{@link #getAgeAtOnset(ConditionEntry) <em>Get Age At Onset</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeAtOnset(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AGE_AT_ONSET__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::ageObservation.
	 * The age of the patient or subject at onset of the condition.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IAgeObservation))->asSequence()->first().oclAsType(domain::IAgeObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IAgeObservation getAgeAtOnset(ConditionEntry conditionEntry) {
		if (GET_AGE_AT_ONSET__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(98));
			try {
				GET_AGE_AT_ONSET__EOCL_QRY = helper.createQuery(GET_AGE_AT_ONSET__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AGE_AT_ONSET__EOCL_QRY);
		return (IAgeObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverity(ConditionEntry) <em>Get Severity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ISeverity))->asSequence()->first().oclAsType(domain::ISeverity)";
	/**
	 * The cached OCL query for the '{@link #getSeverity(ConditionEntry) <em>Get Severity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::severity.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ISeverity))->asSequence()->first().oclAsType(domain::ISeverity)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ISeverity getSeverity(ConditionEntry conditionEntry) {
		if (GET_SEVERITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(99));
			try {
				GET_SEVERITY__EOCL_QRY = helper.createQuery(GET_SEVERITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY__EOCL_QRY);
		return (ISeverity) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemStatus(ConditionEntry) <em>Get Problem Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatus(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemStatusObservation))->asSequence()->first().oclAsType(domain::IProblemStatusObservation)";
	/**
	 * The cached OCL query for the '{@link #getProblemStatus(ConditionEntry) <em>Get Problem Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatus(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::problemStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IProblemStatusObservation))->asSequence()->first().oclAsType(domain::IProblemStatusObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IProblemStatusObservation getProblemStatus(ConditionEntry conditionEntry) {
		if (GET_PROBLEM_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(100));
			try {
				GET_PROBLEM_STATUS__EOCL_QRY = helper.createQuery(GET_PROBLEM_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_STATUS__EOCL_QRY);
		return (IProblemStatusObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation(ConditionEntry) <em>Get Health Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IHealthStatusObservation))->asSequence()->first().oclAsType(domain::IHealthStatusObservation)";
	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation(ConditionEntry) <em>Get Health Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::healthStatusObservation.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::IHealthStatusObservation))->asSequence()->first().oclAsType(domain::IHealthStatusObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  IHealthStatusObservation getHealthStatusObservation(ConditionEntry conditionEntry) {
		if (GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(101));
			try {
				GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_OBSERVATION__EOCL_QRY);
		return (IHealthStatusObservation) query.evaluate(conditionEntry);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(ConditionEntry) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::IComment)).oclAsType(domain::IComment)";
	/**
	 * The cached OCL query for the '{@link #getComments(ConditionEntry) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::comment.
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::IComment)).oclAsType(domain::IComment)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<IComment> getComments(ConditionEntry conditionEntry) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(102));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IComment> result = (Collection<IComment>) query.evaluate(conditionEntry);
		return new BasicEList.UnmodifiableEList<IComment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeath(ConditionEntry) <em>Get Cause Of Death</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ICauseOfDeathObservation))->asSequence()->first().oclAsType(domain::ICauseOfDeathObservation)";
	/**
	 * The cached OCL query for the '{@link #getCauseOfDeath(ConditionEntry) <em>Get Cause Of Death</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeath(ConditionEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * apitest::ConditionEntry::causeOfDeathObservation.
	 * Indicates that this problem was one of the causes of death for the patient or subject of the condition.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ICauseOfDeathObservation))->asSequence()->first().oclAsType(domain::ICauseOfDeathObservation)
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ICauseOfDeathObservation getCauseOfDeath(ConditionEntry conditionEntry) {
		if (GET_CAUSE_OF_DEATH__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(APITestPackage.Literals.CONDITION_ENTRY, APITestPackage.Literals.CONDITION_ENTRY.getEAllOperations().get(103));
			try {
				GET_CAUSE_OF_DEATH__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH__EOCL_QRY);
		return (ICauseOfDeathObservation) query.evaluate(conditionEntry);
	}

} // ConditionEntryOperations