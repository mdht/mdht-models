/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ThrombolyticContraindicationsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thrombolytic Contraindications</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ThrombolyticContraindicationsImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ThrombolyticContraindications {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrombolyticContraindicationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrombolyticContraindicationsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrombolyticContraindicationsMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrombolyticContraindicationsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrombolyticContraindicationsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrombolyticContraindicationsValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrombolyticContraindications init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ThrombolyticContraindications init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ThrombolyticContraindicationsImpl
