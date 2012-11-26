/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.operations.MeasureSectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeasureSectionImpl extends SectionImpl implements MeasureSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MeasureSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return QRDAPackage.Literals.MEASURE_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMeasureSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MeasureSectionOperations.validateMeasureSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMeasureSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MeasureSectionOperations.validateMeasureSectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMeasureSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MeasureSectionOperations.validateMeasureSectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMeasureSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MeasureSectionOperations.validateMeasureSectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MeasureSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MeasureSectionImpl
