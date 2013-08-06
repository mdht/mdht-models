/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Of Procedures Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getHistoryOfProceduresOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent HistoryOfProceduresOrganizerTemplateId' constraints.validation.info='HistoryOfProceduresOrganizerHistoryOfProceduresComponent' templateId.root='2.16.840.1.1133883.17.3.10.1.62'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent constraints.validation.error='HistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponentProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrHistoryOfProceduresOrganizerHistoryOfProceduresComponent constraints.validation.error='HistoryOfProceduresOrganizerHistoryOfProceduresComponentHistoryOfProcedure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrHistoryOfProceduresOrganizerHistoryOfProceduresComponentHistoryOfProcedure code.codeSystem='2.16.840.1.113883.6.4' code.codeSystemName='ICD-10 PCS' constraints.validation.error='HistoryOfProceduresOrganizerHistoryOfProceduresComponentHistoryOfProcedureCode'"
 * @generated
 */
public interface HistoryOfProceduresOrganizer extends Organizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.62\')'"
	* @generated
	*/
	boolean validateHistoryOfProceduresOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfProceduresOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfProceduresOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HistoryOfProceduresOrganizer
