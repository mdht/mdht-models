/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.QuestionnaireFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class QuestionnaireFindingImpl extends ObservationImpl implements QuestionnaireFinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.QUESTIONNAIRE_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionnaireFindingFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionnaireFindingOperations.validateQuestionnaireFindingFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return QuestionnaireFindingOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return QuestionnaireFindingOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return QuestionnaireFindingOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return QuestionnaireFindingOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return QuestionnaireFindingOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return QuestionnaireFindingOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return QuestionnaireFindingOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return QuestionnaireFindingOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return QuestionnaireFindingOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return QuestionnaireFindingOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return QuestionnaireFindingOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireFinding init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public QuestionnaireFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //QuestionnaireFindingImpl
