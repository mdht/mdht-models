/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payers Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPayersSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PayersSectionTemplateId PayersSectionCode PayersSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.18' templateId.extension='2015-08-01' code.code='48768-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Payers' constraints.validation.dependOn.PayersSectionCode='PayersSectionCodeP' constraints.validation.warning='PayersSectionCoverageActivity'"
 * @generated
 */
public interface PayersSection2 extends PayersSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::CoverageActivity2)).oclAsType(consol::CoverageActivity2)'"
	 * @generated
	 */
	EList<CoverageActivity2> getConsolCoverageActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PayersSection2
