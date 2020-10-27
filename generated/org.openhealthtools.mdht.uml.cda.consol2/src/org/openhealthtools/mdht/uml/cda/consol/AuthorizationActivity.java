/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAuthorizationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AuthorizationActivityTemplateId AuthorizationActivityClassCode AuthorizationActivityId AuthorizationActivityMoodCode AuthorizationActivityEntryRelationship AuthorizationActivityEntryRelationshipHasClinicalStatement AuthorizationActivityEntryRelationshipTypeCode' templateId.root='2.16.840.1.113883.10.20.1.19' classCode='ACT' moodCode='EVN' constraints.validation.query='AuthorizationActivityEntryRelationshipHasClinicalStatement AuthorizationActivityEntryRelationshipHasAuthorizedPerformers AuthorizationActivityEntryRelationshipTypeCode' constraints.validation.info='AuthorizationActivityEntryRelationshipHasAuthorizedPerformers'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAuthorizationActivityEntryRelationship constraints.validation.error='AuthorizationActivityEntryRelationshipHasClinicalStatement AuthorizationActivityEntryRelationshipTypeCode' constraints.validation.info='AuthorizationActivityEntryRelationshipHasAuthorizedPerformers' typeCode='SUBJ'"
 * @generated
 */
public interface AuthorizationActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.19\')'"
	 * @generated
	 */
	boolean validateAuthorizationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateAuthorizationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.id-&gt;size() =  1)'"
	 * @generated
	 */
	boolean validateAuthorizationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validateAuthorizationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;reject(act-&gt;exists(moodCode = vocab::x_DocumentActMood::PRMS) or  encounter-&gt;exists(moodCode = vocab::x_DocumentEncounterMood::PRMS) or observation-&gt;exists(moodCode = vocab::x_ActMoodDocumentObservation::PRMS) or  observationMedia-&gt;exists(moodCode = vocab::ActMood::PRMS) or organizer-&gt;exists(moodCode = vocab::ActMood::PRMS) or procedure-&gt;exists(moodCode = vocab::x_DocumentProcedureMood::PRMS) or  regionOfInterest-&gt;exists(moodCode = vocab::ActMood::PRMS) or substanceAdministration-&gt;exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS) or  supply-&gt;exists(moodCode = vocab::x_DocumentSubstanceMood::PRMS))'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipHasClinicalStatement(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;reject(act-&gt;forAll( (moodCode = vocab::x_DocumentActMood::PRMS and performer-&gt;size() &gt; 0) or moodCode &lt;&gt; vocab::x_DocumentActMood::PRMS ) and \r\nencounter-&gt;forAll((moodCode = vocab::x_DocumentEncounterMood::PRMS and performer-&gt;size() &gt; 0) or moodCode &lt;&gt;  vocab::x_DocumentEncounterMood::PRMS) and \r\nobservation-&gt;forAll((moodCode = vocab::x_ActMoodDocumentObservation::PRMS and performer-&gt;size() &gt; 0)  or moodCode &lt;&gt;  vocab::x_ActMoodDocumentObservation::PRMS) and \r\nobservationMedia-&gt;forAll((moodCode = vocab::ActMood::PRMS and performer-&gt;size() &gt; 0) or moodCode &lt;&gt;  vocab::ActMood::PRMS) and \r\norganizer-&gt;forAll((moodCode = vocab::ActMood::PRMS and performer-&gt;size() &gt; 0)  or moodCode &lt;&gt;  vocab::ActMood::PRMS) and \r\nprocedure-&gt;forAll((moodCode = vocab::x_DocumentProcedureMood::PRMS and performer-&gt;size() &gt; 0)  or moodCode &lt;&gt;  vocab::x_DocumentProcedureMood::PRMS) and \r\nregionOfInterest-&gt;forAll((moodCode = vocab::ActMood::PRMS and performer-&gt;size() &gt; 0) or moodCode &lt;&gt;  vocab::ActMood::PRMS) and \r\nsubstanceAdministration-&gt;forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer-&gt;size() &gt; 0)  or moodCode &lt;&gt;  vocab::x_DocumentSubstanceMood::PRMS) and \r\nsupply-&gt;forAll((moodCode = vocab::x_DocumentSubstanceMood::PRMS and performer-&gt;size() &gt; 0) or moodCode &lt;&gt;  vocab::x_DocumentSubstanceMood::PRMS))'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipHasAuthorizedPerformers(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;select(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAuthorizationActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AuthorizationActivity
