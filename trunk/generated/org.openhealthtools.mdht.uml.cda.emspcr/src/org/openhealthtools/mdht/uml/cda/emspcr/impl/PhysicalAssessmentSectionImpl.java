/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.PhysicalExamSectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PhysicalAssessmentSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Assessment Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicalAssessmentSectionImpl extends PhysicalExamSectionImpl implements PhysicalAssessmentSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalAssessmentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionPatientPregnancy(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPatientPregnancy(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionLastOralIntake(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionLastOralIntake(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionPatientAge(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPatientAge(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionThrombolyticContraindications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionThrombolyticContraindications(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalAssessmentSectionBarriersToPatientCare(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionBarriersToPatientCare(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentOrganizer getPhysicalAssessmentOrganizer() {
		return PhysicalAssessmentSectionOperations.getPhysicalAssessmentOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPregnancy getPatientPregnancy() {
		return PhysicalAssessmentSectionOperations.getPatientPregnancy(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastOralIntake getLastOralIntake() {
		return PhysicalAssessmentSectionOperations.getLastOralIntake(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAge getPatientAge() {
		return PhysicalAssessmentSectionOperations.getPatientAge(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrombolyticContraindications getThrombolyticContraindications() {
		return PhysicalAssessmentSectionOperations.getThrombolyticContraindications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarriersToPatientCare getBarriersToPatientCare() {
		return PhysicalAssessmentSectionOperations.getBarriersToPatientCare(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalAssessmentSectionOperations.validatePhysicalExamSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalAssessmentSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalAssessmentSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PhysicalAssessmentSectionImpl
