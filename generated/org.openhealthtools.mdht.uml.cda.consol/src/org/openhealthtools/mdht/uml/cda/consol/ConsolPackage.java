/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolFactory
 * @model kind="package"
 * @generated
 */
public interface ConsolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "consol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/consol";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "consol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.StatusObservationImpl <em>Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.StatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getStatusObservation()
	 * @generated
	 */
	int STATUS_OBSERVATION = 0;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEpisodeObservation()
	 * @generated
	 */
	int EPISODE_OBSERVATION = 2;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Episode Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getConditionEntry()
	 * @generated
	 */
	int CONDITION_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Condition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ENTRY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl <em>Age Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAgeObservation()
	 * @generated
	 */
	int AGE_OBSERVATION = 4;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Age Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OBSERVATION_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl <em>Severity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 5;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Severity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemStatusObservation()
	 * @generated
	 */
	int PROBLEM_STATUS_OBSERVATION = 6;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REALM_CODE = STATUS_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TYPE_ID = STATUS_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TEMPLATE_ID = STATUS_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__ID = STATUS_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__CODE = STATUS_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__DERIVATION_EXPR = STATUS_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TEXT = STATUS_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__STATUS_CODE = STATUS_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__EFFECTIVE_TIME = STATUS_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PRIORITY_CODE = STATUS_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REPEAT_NUMBER = STATUS_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__LANGUAGE_CODE = STATUS_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__VALUE = STATUS_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__INTERPRETATION_CODE = STATUS_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__METHOD_CODE = STATUS_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__TARGET_SITE_CODE = STATUS_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__SUBJECT = STATUS_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__SPECIMEN = STATUS_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PERFORMER = STATUS_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__AUTHOR = STATUS_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__INFORMANT = STATUS_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PARTICIPANT = STATUS_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = STATUS_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REFERENCE = STATUS_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__PRECONDITION = STATUS_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__REFERENCE_RANGE = STATUS_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__NULL_FLAVOR = STATUS_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__CLASS_CODE = STATUS_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__MOOD_CODE = STATUS_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION__NEGATION_IND = STATUS_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Problem Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthStatusObservation()
	 * @generated
	 */
	int HEALTH_STATUS_OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REALM_CODE = STATUS_OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TYPE_ID = STATUS_OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TEMPLATE_ID = STATUS_OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__ID = STATUS_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__CODE = STATUS_OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__DERIVATION_EXPR = STATUS_OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TEXT = STATUS_OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__STATUS_CODE = STATUS_OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__EFFECTIVE_TIME = STATUS_OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PRIORITY_CODE = STATUS_OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REPEAT_NUMBER = STATUS_OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__LANGUAGE_CODE = STATUS_OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__VALUE = STATUS_OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__INTERPRETATION_CODE = STATUS_OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__METHOD_CODE = STATUS_OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__TARGET_SITE_CODE = STATUS_OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__SUBJECT = STATUS_OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__SPECIMEN = STATUS_OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PERFORMER = STATUS_OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__AUTHOR = STATUS_OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__INFORMANT = STATUS_OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PARTICIPANT = STATUS_OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__ENTRY_RELATIONSHIP = STATUS_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REFERENCE = STATUS_OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__PRECONDITION = STATUS_OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__REFERENCE_RANGE = STATUS_OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__NULL_FLAVOR = STATUS_OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__CLASS_CODE = STATUS_OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__MOOD_CODE = STATUS_OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION__NEGATION_IND = STATUS_OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Health Status Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_STATUS_OBSERVATION_FEATURE_COUNT = STATUS_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 8;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemListSection()
	 * @generated
	 */
	int PROBLEM_LIST_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Problem List Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_LIST_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDiagnosticResultsSection()
	 * @generated
	 */
	int DIAGNOSTIC_RESULTS_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Diagnostic Results Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_RESULTS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultOrganizer()
	 * @generated
	 */
	int RESULT_ORGANIZER = 11;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__REALM_CODE = CDAPackage.ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__TYPE_ID = CDAPackage.ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__TEMPLATE_ID = CDAPackage.ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__ID = CDAPackage.ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CODE = CDAPackage.ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__STATUS_CODE = CDAPackage.ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__EFFECTIVE_TIME = CDAPackage.ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__SUBJECT = CDAPackage.ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__SPECIMEN = CDAPackage.ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PERFORMER = CDAPackage.ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__AUTHOR = CDAPackage.ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__INFORMANT = CDAPackage.ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PARTICIPANT = CDAPackage.ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__REFERENCE = CDAPackage.ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__PRECONDITION = CDAPackage.ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__COMPONENT = CDAPackage.ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__NULL_FLAVOR = CDAPackage.ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__CLASS_CODE = CDAPackage.ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER__MOOD_CODE = CDAPackage.ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Result Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_ORGANIZER_FEATURE_COUNT = CDAPackage.ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 12;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REALM_CODE = CDAPackage.OBSERVATION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TYPE_ID = CDAPackage.OBSERVATION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEMPLATE_ID = CDAPackage.OBSERVATION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ID = CDAPackage.OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CODE = CDAPackage.OBSERVATION__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DERIVATION_EXPR = CDAPackage.OBSERVATION__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TEXT = CDAPackage.OBSERVATION__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__STATUS_CODE = CDAPackage.OBSERVATION__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__EFFECTIVE_TIME = CDAPackage.OBSERVATION__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRIORITY_CODE = CDAPackage.OBSERVATION__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REPEAT_NUMBER = CDAPackage.OBSERVATION__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__LANGUAGE_CODE = CDAPackage.OBSERVATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = CDAPackage.OBSERVATION__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INTERPRETATION_CODE = CDAPackage.OBSERVATION__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__METHOD_CODE = CDAPackage.OBSERVATION__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TARGET_SITE_CODE = CDAPackage.OBSERVATION__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SUBJECT = CDAPackage.OBSERVATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__SPECIMEN = CDAPackage.OBSERVATION__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PERFORMER = CDAPackage.OBSERVATION__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__AUTHOR = CDAPackage.OBSERVATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__INFORMANT = CDAPackage.OBSERVATION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PARTICIPANT = CDAPackage.OBSERVATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__ENTRY_RELATIONSHIP = CDAPackage.OBSERVATION__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE = CDAPackage.OBSERVATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__PRECONDITION = CDAPackage.OBSERVATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__REFERENCE_RANGE = CDAPackage.OBSERVATION__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NULL_FLAVOR = CDAPackage.OBSERVATION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CLASS_CODE = CDAPackage.OBSERVATION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__MOOD_CODE = CDAPackage.OBSERVATION__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NEGATION_IND = CDAPackage.OBSERVATION__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = CDAPackage.OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REALM_CODE = CDAPackage.ACT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TYPE_ID = CDAPackage.ACT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TEMPLATE_ID = CDAPackage.ACT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ID = CDAPackage.ACT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CODE = CDAPackage.ACT__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TEXT = CDAPackage.ACT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__STATUS_CODE = CDAPackage.ACT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__EFFECTIVE_TIME = CDAPackage.ACT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PRIORITY_CODE = CDAPackage.ACT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__LANGUAGE_CODE = CDAPackage.ACT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__SUBJECT = CDAPackage.ACT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__SPECIMEN = CDAPackage.ACT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PERFORMER = CDAPackage.ACT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__AUTHOR = CDAPackage.ACT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__INFORMANT = CDAPackage.ACT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PARTICIPANT = CDAPackage.ACT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ENTRY_RELATIONSHIP = CDAPackage.ACT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REFERENCE = CDAPackage.ACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PRECONDITION = CDAPackage.ACT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NULL_FLAVOR = CDAPackage.ACT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CLASS_CODE = CDAPackage.ACT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__MOOD_CODE = CDAPackage.ACT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NEGATION_IND = CDAPackage.ACT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = CDAPackage.ACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsSection()
	 * @generated
	 */
	int VITAL_SIGNS_SECTION = 14;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ID = CDAPackage.SECTION__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vital Signs Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsOrganizer()
	 * @generated
	 */
	int VITAL_SIGNS_ORGANIZER = 15;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__REALM_CODE = RESULT_ORGANIZER__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__TYPE_ID = RESULT_ORGANIZER__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__TEMPLATE_ID = RESULT_ORGANIZER__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__ID = RESULT_ORGANIZER__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__CODE = RESULT_ORGANIZER__CODE;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__STATUS_CODE = RESULT_ORGANIZER__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__EFFECTIVE_TIME = RESULT_ORGANIZER__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__SUBJECT = RESULT_ORGANIZER__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__SPECIMEN = RESULT_ORGANIZER__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PERFORMER = RESULT_ORGANIZER__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__AUTHOR = RESULT_ORGANIZER__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__INFORMANT = RESULT_ORGANIZER__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PARTICIPANT = RESULT_ORGANIZER__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__REFERENCE = RESULT_ORGANIZER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__PRECONDITION = RESULT_ORGANIZER__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__COMPONENT = RESULT_ORGANIZER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__NULL_FLAVOR = RESULT_ORGANIZER__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__CLASS_CODE = RESULT_ORGANIZER__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER__MOOD_CODE = RESULT_ORGANIZER__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>Vital Signs Organizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGNS_ORGANIZER_FEATURE_COUNT = RESULT_ORGANIZER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl <em>Vital Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSign()
	 * @generated
	 */
	int VITAL_SIGN = 16;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REALM_CODE = RESULT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TYPE_ID = RESULT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEMPLATE_ID = RESULT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ID = RESULT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CODE = RESULT__CODE;

	/**
	 * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__DERIVATION_EXPR = RESULT__DERIVATION_EXPR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TEXT = RESULT__TEXT;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__STATUS_CODE = RESULT__STATUS_CODE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__EFFECTIVE_TIME = RESULT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRIORITY_CODE = RESULT__PRIORITY_CODE;

	/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REPEAT_NUMBER = RESULT__REPEAT_NUMBER;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__LANGUAGE_CODE = RESULT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__VALUE = RESULT__VALUE;

	/**
	 * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INTERPRETATION_CODE = RESULT__INTERPRETATION_CODE;

	/**
	 * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__METHOD_CODE = RESULT__METHOD_CODE;

	/**
	 * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__TARGET_SITE_CODE = RESULT__TARGET_SITE_CODE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SUBJECT = RESULT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__SPECIMEN = RESULT__SPECIMEN;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PERFORMER = RESULT__PERFORMER;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__AUTHOR = RESULT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__INFORMANT = RESULT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PARTICIPANT = RESULT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__ENTRY_RELATIONSHIP = RESULT__ENTRY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE = RESULT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__PRECONDITION = RESULT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__REFERENCE_RANGE = RESULT__REFERENCE_RANGE;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NULL_FLAVOR = RESULT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__CLASS_CODE = RESULT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__MOOD_CODE = RESULT__MOOD_CODE;

	/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN__NEGATION_IND = RESULT__NEGATION_IND;

	/**
	 * The number of structural features of the '<em>Vital Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITAL_SIGN_FEATURE_COUNT = RESULT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl
	 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralHeaderConstraints()
	 * @generated
	 */
	int GENERAL_HEADER_CONSTRAINTS = 17;

	/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__REALM_CODE = CDAPackage.CLINICAL_DOCUMENT__REALM_CODE;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TYPE_ID = CDAPackage.CLINICAL_DOCUMENT__TYPE_ID;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID = CDAPackage.CLINICAL_DOCUMENT__TEMPLATE_ID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__ID = CDAPackage.CLINICAL_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CODE = CDAPackage.CLINICAL_DOCUMENT__CODE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__TITLE = CDAPackage.CLINICAL_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME = CDAPackage.CLINICAL_DOCUMENT__EFFECTIVE_TIME;

	/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE = CDAPackage.CLINICAL_DOCUMENT__CONFIDENTIALITY_CODE;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE = CDAPackage.CLINICAL_DOCUMENT__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__SET_ID = CDAPackage.CLINICAL_DOCUMENT__SET_ID;

	/**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER = CDAPackage.CLINICAL_DOCUMENT__VERSION_NUMBER;

	/**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COPY_TIME = CDAPackage.CLINICAL_DOCUMENT__COPY_TIME;

	/**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET = CDAPackage.CLINICAL_DOCUMENT__RECORD_TARGET;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHOR = CDAPackage.CLINICAL_DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER = CDAPackage.CLINICAL_DOCUMENT__DATA_ENTERER;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__INFORMANT = CDAPackage.CLINICAL_DOCUMENT__INFORMANT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CUSTODIAN = CDAPackage.CLINICAL_DOCUMENT__CUSTODIAN;

	/**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT = CDAPackage.CLINICAL_DOCUMENT__INFORMATION_RECIPIENT;

	/**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__LEGAL_AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR = CDAPackage.CLINICAL_DOCUMENT__AUTHENTICATOR;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__PARTICIPANT = CDAPackage.CLINICAL_DOCUMENT__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF = CDAPackage.CLINICAL_DOCUMENT__IN_FULFILLMENT_OF;

	/**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF = CDAPackage.CLINICAL_DOCUMENT__DOCUMENTATION_OF;

	/**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT = CDAPackage.CLINICAL_DOCUMENT__RELATED_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION = CDAPackage.CLINICAL_DOCUMENT__AUTHORIZATION;

	/**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF = CDAPackage.CLINICAL_DOCUMENT__COMPONENT_OF;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__COMPONENT = CDAPackage.CLINICAL_DOCUMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR = CDAPackage.CLINICAL_DOCUMENT__NULL_FLAVOR;

	/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__CLASS_CODE = CDAPackage.CLINICAL_DOCUMENT__CLASS_CODE;

	/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS__MOOD_CODE = CDAPackage.CLINICAL_DOCUMENT__MOOD_CODE;

	/**
	 * The number of structural features of the '<em>General Header Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT = CDAPackage.CLINICAL_DOCUMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.StatusObservation <em>Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.StatusObservation
	 * @generated
	 */
	EClass getStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation
	 * @generated
	 */
	EClass getEpisodeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry <em>Condition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Entry</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConditionEntry
	 * @generated
	 */
	EClass getConditionEntry();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AgeObservation
	 * @generated
	 */
	EClass getAgeObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Severity
	 * @generated
	 */
	EClass getSeverity();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation
	 * @generated
	 */
	EClass getProblemStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Status Observation</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation
	 * @generated
	 */
	EClass getHealthStatusObservation();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem List Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemListSection
	 * @generated
	 */
	EClass getProblemListSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic Results Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection
	 * @generated
	 */
	EClass getDiagnosticResultsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	EClass getResultOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection
	 * @generated
	 */
	EClass getVitalSignsSection();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Signs Organizer</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer
	 * @generated
	 */
	EClass getVitalSignsOrganizer();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vital Sign</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSign
	 * @generated
	 */
	EClass getVitalSign();

	/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Header Constraints</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	EClass getGeneralHeaderConstraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConsolFactory getConsolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.StatusObservationImpl <em>Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.StatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getStatusObservation()
		 * @generated
		 */
		EClass STATUS_OBSERVATION = eINSTANCE.getStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl <em>Episode Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.EpisodeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getEpisodeObservation()
		 * @generated
		 */
		EClass EPISODE_OBSERVATION = eINSTANCE.getEpisodeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl <em>Condition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConditionEntryImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getConditionEntry()
		 * @generated
		 */
		EClass CONDITION_ENTRY = eINSTANCE.getConditionEntry();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl <em>Age Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.AgeObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getAgeObservation()
		 * @generated
		 */
		EClass AGE_OBSERVATION = eINSTANCE.getAgeObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl <em>Severity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.SeverityImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getSeverity()
		 * @generated
		 */
		EClass SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl <em>Problem Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemStatusObservation()
		 * @generated
		 */
		EClass PROBLEM_STATUS_OBSERVATION = eINSTANCE.getProblemStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl <em>Health Status Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.HealthStatusObservationImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getHealthStatusObservation()
		 * @generated
		 */
		EClass HEALTH_STATUS_OBSERVATION = eINSTANCE.getHealthStatusObservation();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.CommentImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl <em>Problem List Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ProblemListSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getProblemListSection()
		 * @generated
		 */
		EClass PROBLEM_LIST_SECTION = eINSTANCE.getProblemListSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl <em>Diagnostic Results Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.DiagnosticResultsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getDiagnosticResultsSection()
		 * @generated
		 */
		EClass DIAGNOSTIC_RESULTS_SECTION = eINSTANCE.getDiagnosticResultsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl <em>Result Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResultOrganizer()
		 * @generated
		 */
		EClass RESULT_ORGANIZER = eINSTANCE.getResultOrganizer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ResultImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ExternalReferenceImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl <em>Vital Signs Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsSection()
		 * @generated
		 */
		EClass VITAL_SIGNS_SECTION = eINSTANCE.getVitalSignsSection();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl <em>Vital Signs Organizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSignsOrganizer()
		 * @generated
		 */
		EClass VITAL_SIGNS_ORGANIZER = eINSTANCE.getVitalSignsOrganizer();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl <em>Vital Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getVitalSign()
		 * @generated
		 */
		EClass VITAL_SIGN = eINSTANCE.getVitalSign();

		/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl <em>General Header Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl
		 * @see org.openhealthtools.mdht.uml.cda.consol.impl.ConsolPackageImpl#getGeneralHeaderConstraints()
		 * @generated
		 */
		EClass GENERAL_HEADER_CONSTRAINTS = eINSTANCE.getGeneralHeaderConstraints();

	}

} //ConsolPackage
