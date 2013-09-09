/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Newborn Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NewbornDeliverySectionImpl extends SectionImpl implements NewbornDeliverySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewbornDeliverySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionBirthOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNumberofInfantsBornAlive(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNumberofInfantsBornAlive(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionCongenitalAnomalies(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionCongenitalAnomalies(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornsVitalSignsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornsVitalSignsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionInfantLiving(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantLiving(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionInfantBreastfed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantBreastfed(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionInfantTransfer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionInfantTransfer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionPlurality(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewbornDeliverySectionNewbornSubjectRelatedSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NewbornDeliverySectionOperations.validateNewbornDeliverySectionNewbornSubjectRelatedSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthOrder getBirthOrder() {
		return NewbornDeliverySectionOperations.getBirthOrder(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofInfantsBornAlive getNumberofInfantsBornAlive() {
		return NewbornDeliverySectionOperations.getNumberofInfantsBornAlive(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CongenitalAnomaly> getCongenitalAnomaliess() {
		return NewbornDeliverySectionOperations.getCongenitalAnomaliess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornsVitalSignsSection getNewbornsVitalSignsSection() {
		return NewbornDeliverySectionOperations.getNewbornsVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbnormalConditionoftheNewborn> getAbnormalConditionsoftheNewborns() {
		return NewbornDeliverySectionOperations.getAbnormalConditionsoftheNewborns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantLiving getInfantLiving() {
		return NewbornDeliverySectionOperations.getInfantLiving(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantBreastfed getInfantBreastfed() {
		return NewbornDeliverySectionOperations.getInfantBreastfed(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfantTransfer getInfantTransfer() {
		return NewbornDeliverySectionOperations.getInfantTransfer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plurality getPlurality() {
		return NewbornDeliverySectionOperations.getPlurality(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornDeliverySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornDeliverySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // NewbornDeliverySectionImpl
