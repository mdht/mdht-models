/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.CopyRightSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Right Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CopyRightSectionImpl extends SectionImpl implements CopyRightSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyRightSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.COPY_RIGHT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightSectionOperations.validateCopyRightSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSectionLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightSectionOperations.validateCopyRightSectionLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightSectionOperations.validateCopyRightSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CopyRightSectionOperations.validateCopyRightSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyRightSectionCopyRightPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CopyRightSectionOperations.validateCopyRightSectionCopyRightPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CopyRightPatternObservation> getCopyRightPatternObservations() {
		return CopyRightSectionOperations.getCopyRightPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyRightSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CopyRightSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CopyRightSectionImpl
