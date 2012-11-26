/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProceduresAndInterventionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures And Interventions Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProceduresAndInterventionsSectionImpl extends SectionImpl implements ProceduresAndInterventionsSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProceduresAndInterventionsSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.PROCEDURES_AND_INTERVENTIONS_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProceduresAndInterventionsSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresAndInterventionsSectionOperations.validateProceduresAndInterventionsSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProceduresAndInterventionsSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresAndInterventionsSectionOperations.validateProceduresAndInterventionsSectionCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProcedureEntry getProcedureEntry() {
		return ProceduresAndInterventionsSectionOperations.getProcedureEntry(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProceduresAndInterventionsSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresAndInterventionsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProceduresAndInterventionsSectionImpl
