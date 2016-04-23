/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getResultsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultsSectionEntriesOptionalTemplateId ResultsSectionEntriesOptionalCode ResultsSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.3' templateId.extension='2015-08-01' code.code='30954-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Relevant diagnostic tests and/or laboratory data' constraints.validation.dependOn.ResultsSectionEntriesOptionalCode='ResultsSectionEntriesOptionalCodeP' constraints.validation.warning='ResultsSectionEntriesOptionalResultOrganizer'"
 * @generated
 */
public interface ResultsSectionEntriesOptional2 extends ResultsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::ResultOrganizer2)).oclAsType(consol::ResultOrganizer2)'"
	 * @generated
	 */
	EList<ResultOrganizer2> getConsolResultOrganizer2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultsSectionEntriesOptional2
