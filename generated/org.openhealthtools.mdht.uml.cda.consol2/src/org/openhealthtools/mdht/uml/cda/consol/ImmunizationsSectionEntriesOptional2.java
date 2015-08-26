/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunizations Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getImmunizationsSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ImmunizationsSectionEntriesOptionalTemplateId ImmunizationsSectionEntriesOptionalCode ImmunizationsSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.2' templateId.extension='2015-08-01' code.code='11369-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Immunizations' constraints.validation.dependOn.ImmunizationsSectionEntriesOptionalCode='ImmunizationsSectionEntriesOptionalCodeP' constraints.validation.warning='ImmunizationsSectionEntriesOptionalImmunizationActivity'"
 * @generated
 */
public interface ImmunizationsSectionEntriesOptional2 extends ImmunizationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity2)).oclAsType(consol::ImmunizationActivity2)'"
	 * @generated
	 */
	EList<ImmunizationActivity2> getConsolImmunizationActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ImmunizationsSectionEntriesOptional2
