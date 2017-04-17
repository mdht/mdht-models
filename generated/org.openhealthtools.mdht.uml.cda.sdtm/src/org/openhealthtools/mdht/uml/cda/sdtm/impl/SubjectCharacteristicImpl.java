/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectCharacteristicOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubjectCharacteristicImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements SubjectCharacteristic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SUBJECT_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectCharacteristicFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectCharacteristicOperations.validateSubjectCharacteristicFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return SubjectCharacteristicOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return SubjectCharacteristicOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return SubjectCharacteristicOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return SubjectCharacteristicOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return SubjectCharacteristicOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return SubjectCharacteristicOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return SubjectCharacteristicOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return SubjectCharacteristicOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return SubjectCharacteristicOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return SubjectCharacteristicOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectCharacteristic init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SubjectCharacteristic init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //SubjectCharacteristicImpl
