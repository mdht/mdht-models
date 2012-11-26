/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result Observation</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultObservationImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl
		implements ResultObservation {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected ResultObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.RESULT_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMu2consolResultObservationResultObservationCodeValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultObservationOperations.validateMu2consolResultObservationResultObservationCodeValue(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMu2consolResultObservationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultObservationOperations.validateMu2consolResultObservationCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateResultObservationTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return ResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResultObservation init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResultObservation init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResultObservationImpl
