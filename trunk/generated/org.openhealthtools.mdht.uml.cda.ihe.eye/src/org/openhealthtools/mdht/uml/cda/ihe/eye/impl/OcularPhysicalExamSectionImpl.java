/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.RoutineEyeExamSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.OcularPhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.PhysicalExamSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocular Physical Exam Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OcularPhysicalExamSectionImpl extends PhysicalExamSectionImpl implements OcularPhysicalExamSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularPhysicalExamSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularPhysicalExamSectionOperations.validateOcularPhysicalExamSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOcularPhysicalExamSectionRoutineEyeExamSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularPhysicalExamSectionOperations.validateOcularPhysicalExamSectionRoutineEyeExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineEyeExamSection getRoutineEyeExamSection() {
		return OcularPhysicalExamSectionOperations.getRoutineEyeExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicalExamSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OcularPhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OcularPhysicalExamSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OcularPhysicalExamSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OcularPhysicalExamSectionImpl
