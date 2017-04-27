/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MedicalHistoryItemOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical History Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MedicalHistoryItemImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements MedicalHistoryItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalHistoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.MEDICAL_HISTORY_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemBodySystemorOrganClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemStartRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemStartRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemStopRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemStopRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicalHistoryItemFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalHistoryItemOperations.validateMedicalHistoryItemFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return MedicalHistoryItemOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return MedicalHistoryItemOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return MedicalHistoryItemOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass getBodySystemorOrganClass() {
		return MedicalHistoryItemOperations.getBodySystemorOrganClass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return MedicalHistoryItemOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return MedicalHistoryItemOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return MedicalHistoryItemOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return MedicalHistoryItemOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return MedicalHistoryItemOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod getStartRelativetoReferencePeriod() {
		return MedicalHistoryItemOperations.getStartRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod getStopRelativetoReferencePeriod() {
		return MedicalHistoryItemOperations.getStopRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return MedicalHistoryItemOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return MedicalHistoryItemOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return MedicalHistoryItemOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalHistoryItem init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MedicalHistoryItem init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //MedicalHistoryItemImpl
