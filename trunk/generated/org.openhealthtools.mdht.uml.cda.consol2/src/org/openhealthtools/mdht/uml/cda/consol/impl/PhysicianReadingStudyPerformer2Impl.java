/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformer2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physician Reading Study Performer2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformer2Impl extends PhysicianReadingStudyPerformerImpl implements
		PhysicianReadingStudyPerformer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformer2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianReadingStudyPerformerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianReadingStudyPerformer2Operations.validatePhysicianReadingStudyPerformerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianReadingStudyPerformer2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianReadingStudyPerformer2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PhysicianReadingStudyPerformer2Impl
