/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseMediaPattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.ResponseMediaPatternOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Media Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseMediaPatternImpl extends ObservationImpl implements ResponseMediaPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseMediaPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.RESPONSE_MEDIA_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseMediaPatternTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseMediaPatternOperations.validateResponseMediaPatternTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMediaPattern init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseMediaPattern init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponseMediaPatternImpl
