/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrenatalTestingandSurveillanceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prenatal Testingand Surveillance Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrenatalTestingandSurveillanceSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl
		implements PrenatalTestingandSurveillanceSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrenatalTestingandSurveillanceSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrenatalTestingandSurveillanceSectionPrenatalCare(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionPrenatalCare(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrenatalCare getPrenatalCare() {
		return PrenatalTestingandSurveillanceSectionOperations.getPrenatalCare(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrenatalTestingandSurveillanceSection init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrenatalTestingandSurveillanceSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // PrenatalTestingandSurveillanceSectionImpl
