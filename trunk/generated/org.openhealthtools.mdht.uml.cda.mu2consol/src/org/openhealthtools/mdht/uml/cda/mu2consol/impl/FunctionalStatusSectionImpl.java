/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.FunctionalStatusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl implements FunctionalStatusSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FunctionalStatusSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations() {
    return FunctionalStatusSectionOperations.getMu2consolCognitiveStatusResultObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<CognitiveStatusResultOrganizer> getMu2consolCognitiveStatusResultOrganizers() {
    return FunctionalStatusSectionOperations.getMu2consolCognitiveStatusResultOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations() {
    return FunctionalStatusSectionOperations.getMu2consolFunctionalStatusResultObservations(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<FunctionalStatusResultOrganizer> getMu2consolFunctionalStatusResultOrganizers() {
    return FunctionalStatusSectionOperations.getMu2consolFunctionalStatusResultOrganizers(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public FunctionalStatusSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //FunctionalStatusSectionImpl
