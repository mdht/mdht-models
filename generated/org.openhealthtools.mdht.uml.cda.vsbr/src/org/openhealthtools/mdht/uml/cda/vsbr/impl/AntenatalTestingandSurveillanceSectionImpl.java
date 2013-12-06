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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AntenatalTestingandSurveillanceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antenatal Testingand Surveillance Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AntenatalTestingandSurveillanceSectionImpl extends SectionImpl implements
		AntenatalTestingandSurveillanceSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AntenatalTestingandSurveillanceSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateAntenatalTestingandSurveillanceSectionPreNatalCare(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionPreNatalCare(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrenatalCare getPreNatalCare() {
    return AntenatalTestingandSurveillanceSectionOperations.getPreNatalCare(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AntenatalTestingandSurveillanceSection init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AntenatalTestingandSurveillanceSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AntenatalTestingandSurveillanceSectionImpl
