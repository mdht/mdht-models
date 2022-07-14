/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Exam Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalExamSection2Impl extends PhysicalExamSectionImpl implements PhysicalExamSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICAL_EXAM_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2WoundObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2WoundObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2Component(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2Component(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection2ComponentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongitudinalCareWoundObservation> getWoundObservations() {
		return PhysicalExamSection2Operations.getWoundObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PressureUlcerObservation> getConsolPressureUlcerObservations() {
		return PhysicalExamSection2Operations.getConsolPressureUlcerObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HighestPressureUlcerStage> getConsolHighestPressureUlcerStages() {
		return PhysicalExamSection2Operations.getConsolHighestPressureUlcerStages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberOfPressureUlcersObservation> getConsolNumberOfPressureUlcersObservations() {
		return PhysicalExamSection2Operations.getConsolNumberOfPressureUlcersObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionPressureUlcerObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionPressureUlcerObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionHighestPressureUlcerStage(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionHighestPressureUlcerStage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionNumberOfPressureUlcersObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalExamSection2Operations.validatePhysicalExamSectionNumberOfPressureUlcersObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public PhysicalExamSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PhysicalExamSection2Impl
