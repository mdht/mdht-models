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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ComplicationsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complications Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ComplicationsSection2Impl extends ComplicationsSectionImpl implements ComplicationsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplicationsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COMPLICATIONS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplicationsSectionExplicitComplications(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComplicationsSection2Operations.validateComplicationsSectionExplicitComplications(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplicationsSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplicationsSection2Operations.validateComplicationsSection2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return ComplicationsSection2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComplicationsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplicationsSection2Operations.validateComplicationsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComplicationsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ComplicationsSection2Operations.validateComplicationsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateComplicationsSectionProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ComplicationsSection2Operations.validateComplicationsSectionProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ComplicationsSection2Impl
