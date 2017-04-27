/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.RelatedSubjectImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext;
import org.openhealthtools.mdht.uml.cda.consol.operations.FetusSubjectContextOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetus Subject Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FetusSubjectContextImpl extends RelatedSubjectImpl implements FetusSubjectContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetusSubjectContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FETUS_SUBJECT_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetusSubjectContextTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetusSubjectContextOperations.validateFetusSubjectContextTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetusSubjectContextCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetusSubjectContextOperations.validateFetusSubjectContextCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetusSubjectContextSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FetusSubjectContextOperations.validateFetusSubjectContextSubject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetusSubjectContext init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetusSubjectContext init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FetusSubjectContextImpl
