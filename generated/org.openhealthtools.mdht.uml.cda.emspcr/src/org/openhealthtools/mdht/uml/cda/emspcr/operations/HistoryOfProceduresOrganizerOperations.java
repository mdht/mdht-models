/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Procedures Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Existence Of History Of Procedure Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer History Of Procedures Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer#validateHistoryOfProceduresOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfProceduresOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfProceduresOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Existence Of History Of Procedure Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Existence Of History Of Procedure Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfProceduresOrganizer The receiving '<em><b>History Of Procedures Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(HistoryOfProceduresOrganizer historyOfProceduresOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_PROCEDURES_ORGANIZER);
			try {
				VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfProceduresOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_PROCEDURES_ORGANIZER__HISTORY_OF_PROCEDURES_ORGANIZER_EXISTENCE_OF_HISTORY_OF_PROCEDURE_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent"),
						 new Object [] { historyOfProceduresOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer History Of Procedures Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer History Of Procedures Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfProceduresOrganizer The receiving '<em><b>History Of Procedures Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(HistoryOfProceduresOrganizer historyOfProceduresOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_PROCEDURES_ORGANIZER);
			try {
				VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfProceduresOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_PROCEDURES_ORGANIZER__HISTORY_OF_PROCEDURES_ORGANIZER_HISTORY_OF_PROCEDURES_COMPONENT,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfProceduresOrganizerHistoryOfProceduresComponent"),
						 new Object [] { historyOfProceduresOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfProceduresOrganizerTemplateId(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerTemplateId(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.62')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfProceduresOrganizerTemplateId(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Procedures Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfProceduresOrganizerTemplateId(HistoryOfProceduresOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyOfProceduresOrganizer The receiving '<em><b>History Of Procedures Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfProceduresOrganizerTemplateId(HistoryOfProceduresOrganizer historyOfProceduresOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HISTORY_OF_PROCEDURES_ORGANIZER);
			try {
				VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfProceduresOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HISTORY_OF_PROCEDURES_ORGANIZER__HISTORY_OF_PROCEDURES_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("HistoryOfProceduresOrganizerTemplateId"),
						 new Object [] { historyOfProceduresOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // HistoryOfProceduresOrganizerOperations